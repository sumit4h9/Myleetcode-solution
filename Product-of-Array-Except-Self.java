1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5
6        int prefix = 1;
7        for(int i=0; i<n; i++){
8            result[i] = prefix;
9            prefix *= nums[i];
10        }
11
12        int suffix = 1;
13        for(int i=n-1; i>=0; i--){
14            result[i] *= suffix;
15            suffix *= nums[i];
16        }
17        return result;
18        
19    }
20}