1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        if(n == 0) return 0;
5
6        int k = 1;
7        for(int i = 1; i < n; i++){
8            if(nums[i]!=nums[k-1]){
9                nums[k]=nums[i];
10                k++;
11            }
12        }
13        return k;
14    }
15}