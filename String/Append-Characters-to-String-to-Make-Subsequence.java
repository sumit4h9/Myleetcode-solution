1class Solution {
2    public int appendCharacters(String s, String t) {
3        int slen = s.length();
4        int tlen = t.length();
5        int sIn = 0;
6        int tIn = 0;
7
8        while(sIn < slen && tIn < tlen){
9            if(s.charAt(sIn) == t.charAt(tIn)){
10                tIn++;
11            }
12            sIn++;
13        }
14        return tlen - tIn;
15    }
16}