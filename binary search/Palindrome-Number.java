1class Solution {
2    public boolean isPalindrome(int x) {
3        // Negative numbers OR numbers ending with 0 (except 0 itself)
4        if (x < 0 || (x % 10 == 0 && x != 0)) {
5            return false;
6        }
7
8        int reversedHalf = 0;
9
10        while (x > reversedHalf) {
11            reversedHalf = reversedHalf * 10 + x % 10;
12            x /= 10;
13        }
14
15        // For even length: x == reversedHalf
16        // For odd length: x == reversedHalf / 10
17        return x == reversedHalf || x == reversedHalf / 10;
18    }
19}