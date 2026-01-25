1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet <Integer> nus = new HashSet<>();
4
5        for(int num:nums){
6            if(nus.contains(num)){
7                return true;
8            }
9            nus.add(num);
10        }
11        return false;
12    }
13}