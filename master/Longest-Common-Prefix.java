1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if( strs == null || strs.length == 0){
4            return "";
5        }
6
7        for(int i = 0; i < strs[0].length(); i++){
8            char ch = strs[0].charAt(i);
9
10            for(int j = 1; j < strs.length; j++){
11
12                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
13                    return strs[0].substring(0 , i);
14                }
15
16            }
17        }
18        return strs[0];
19    }
20}