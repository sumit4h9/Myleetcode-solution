1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4        
5        for(int i = digits.length-1; i >=0; i--){
6            if(digits[i] < 9){
7                digits[i]++;
8                return digits;
9            }
10            digits[i]= 0;
11        }
12            int[] result = new int[n+1];
13            result[0] = 1;
14            return result;
15    }
16}