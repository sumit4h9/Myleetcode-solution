1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n = nums.length;
4
5        int low = 0;
6        int high = n-1;
7        while(low<high){
8            int mid = (low + high)/ 2;
9
10            if(mid%2==1){
11               mid--;
12            }
13            if(nums[mid] == nums[mid+1]){
14                low = mid + 2;
15            }
16            else{
17                high = mid;
18            }
19        }
20        return nums[low];
21    }
22}