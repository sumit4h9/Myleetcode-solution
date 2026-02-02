1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> nus = new HashSet<>();
4        int longest =0;
5        for(int num:nums){
6            nus.add(num);
7        }
8
9        for(int num:nus){
10            if(!nus.contains(num-1)){
11                int current = num;
12                int count = 1;
13
14                while(nus.contains(current+1)){
15                    current++;
16                    count++;
17                }
18                longest = Math.max(count,longest);
19            }
20
21            
22        }
23        return longest;
24    }
25}