1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currentS = 0;
4        int max = nums[0] ;
5
6        for(int num:nums){
7            if(currentS < 0 ) {
8                currentS = 0;
9            }
10            currentS = Math.max(num , currentS+num);
11            max = Math.max(max ,currentS);
12        }
13        return max;
14
15    }
16}