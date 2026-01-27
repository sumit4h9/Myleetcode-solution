1class Solution {
2    public void moveZeroes(int[] nums) {
3        int count = 0;
4
5        for(int num:nums){
6            if(num!=0){
7                nums[count++] = num;
8            }
9        }
10        while(count < nums.length){
11            nums[count++] = 0;
12        }
13    }
14}