1class Solution {
2    public int scoreOfString(String s) {
3        int sum = 0;
4
5        for(int i=0; i<s.length()-1; i++){
6            sum += Math.abs(s.charAt(i) - s.charAt(i+1));
7        }
8        return sum;
9    }
10}