1class Solution {
2    public String gcdOfStrings(String str1, String str2) {
3        if((!(str1 + str2).equals(str2+str1)))return "";
4
5        int gcdLength = gcd(str1.length(),str2.length());
6
7        return str1.substring(0 ,gcdLength);
8        
9    }
10    private int gcd(int a ,int b){
11        return b == 0 ? a : gcd(b, a % b);
12    }
13}