1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = nums[0];
4        int min = nums[0];
5        int result = nums[0];
6        
7
8        for(int i=1; i<nums.length; i++){
9            int currentP = nums[i];
10            int tempmax = Math.max(currentP,Math.max(currentP*min,currentP*max));
11            int tempmin = Math.min(currentP,Math.min(currentP*min,currentP*max));
12
13            min = tempmin;
14            max = tempmax;
15
16            result = Math.max(result,max);
17        }
18        return result;
19    }
20}