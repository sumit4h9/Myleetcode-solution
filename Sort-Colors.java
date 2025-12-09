1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0;
4        int mid = 0;
5        int high = nums.length-1 ;
6
7        while(mid<=high){
8            if(nums[mid]==0){
9                int temp = nums[low];
10                nums[low] = nums[mid];
11                nums[mid] = temp ;
12                low++;
13                mid++;
14            }
15            else if(nums[mid]==1){
16                mid++;
17            }
18            else{
19                int temp = nums[high];
20                nums[high] = nums[mid];
21                nums[mid] = temp;
22                high--;
23            }
24        }
25    }
26}