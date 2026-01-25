1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer, Integer> nus = new HashMap<>();
4        int n = nums.length;
5        
6        for(int i = 0; i < n; i++){
7            if(nus.containsKey(nums[i])){
8                int prevIndex = nus.get(nums[i]);
9                if(k >=  i - prevIndex){
10                    return true;
11                }
12
13            }
14            nus.put(nums[i],i);
15        }
16        return false;
17    }
18}