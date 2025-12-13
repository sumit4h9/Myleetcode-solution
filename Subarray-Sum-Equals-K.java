1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer , Integer> map = new HashMap<>();
4        map.put(0,1);
5
6        int count = 0;
7        int curr = 0;
8
9        for(int num:nums){
10            curr +=num;
11
12            int need = curr -k ;
13            if(map.containsKey(need)){
14                count += map.get(need);
15            }
16
17            map.put(curr ,map.getOrDefault(curr,0)+1);
18        }
19        return count ;
20    }
21}