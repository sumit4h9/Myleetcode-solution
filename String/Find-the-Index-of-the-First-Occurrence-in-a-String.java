1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(haystack.contains(needle)){
4            return haystack.indexOf(needle);
5        }
6        else{
7            return -1;
8        }
9    }
10}