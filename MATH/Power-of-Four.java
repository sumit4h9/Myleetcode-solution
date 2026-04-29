1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n <= 0)return false;
4
5        while(n%4==0){
6            n/=4;
7        }
8        return n == 1;
9    }
10}