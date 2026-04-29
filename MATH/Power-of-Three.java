1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if (n <= 0) return false;
4        while (n % 3 == 0) {
5            n /= 3;
6        }
7        return n == 1;
8    }
9}