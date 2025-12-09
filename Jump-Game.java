1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        int maxreach = 0 ;
5
6
7        for(int i=0; i<n;i++){
8            if(i > maxreach){
9            return false;
10            }
11            maxreach = Math.max(maxreach , i + nums[i]);
12        }
13        return true;
14    }
15}