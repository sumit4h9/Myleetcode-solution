1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        
4        int n = nums.length;
5        int low = 0;
6        int high = n-1;
7
8        while(low<=high){
9
10            if(nums[low] % 2 != 0){
11                int temp = nums[high];
12                nums[high] = nums[low];
13                nums[low] = temp;
14                high--;
15                // low++;
16            }
17            else{
18                low++;
19            }
20        }
21        return nums;
22        
23    }
24}