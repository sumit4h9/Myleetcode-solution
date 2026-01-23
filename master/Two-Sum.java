1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer , Integer> mp = new HashMap<>();
4
5        for(int i=0;i<nums.length; i++){
6            int complement = target - nums[i];
7            if(mp.containsKey(complement)){
8                return new int[]{mp.get(complement),i};
9            }
10            mp.put(nums[i],i);
11        }
12        return new int[]{};
13    }
14}