1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int maxSum = nums[0];
5        int cusum = 0 ;
6
7        for(int num:nums){
8            if(cusum<0){
9                cusum = 0;
10            }
11            cusum +=num;
12            maxSum=Math.max(maxSum,cusum);
13        }
14        return maxSum;
15    }
16}