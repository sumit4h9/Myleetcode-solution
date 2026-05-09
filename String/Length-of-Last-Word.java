1class Solution {
2    public int lengthOfLastWord(String s) {
3        s = s.trim();
4
5        int lastSpaceIndex = s.lastIndexOf(' ');
6
7        return s.length() - lastSpaceIndex-1;
8    }
9}