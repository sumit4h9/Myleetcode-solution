1class Solution {
2    public boolean isAnagram(String s, String t) {
3        
4        if(s.length() != t.length()){
5            return false;
6        }
7
8        int[] freq = new int[26];
9
10        for(int i=0; i<s.length(); i++){
11            freq[s.charAt(i)- 'a']++;
12        }
13
14        for(int i=0; i<t.length(); i++){
15            freq[t.charAt(i)- 'a']--;
16        }
17
18        for(int count:freq){
19            if(count!=0){
20                return false;
21            }
22        }
23        return true;
24    }
25}