1class Solution {
2    public int singleNumber(int[] nums) {
3        int ones = 0, twos = 0;
4        for(int num:nums){
5            ones = (ones ^ num) & ~twos;
6            twos = (twos ^ num) & ~ones;
7        }
8        return ones;
9    }
10}