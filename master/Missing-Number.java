1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int total = 0;
5        int nsum = n*(n+1)/2;
6        for(int num:nums){
7            total +=num;
8        }
9        int g = nsum - total;
10        return  g;
11    }
12}