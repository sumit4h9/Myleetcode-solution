1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int diff = 0;
4        for (int num : nums) {
5            diff ^= num;
6        }
7        int mask = diff & -diff;
8        int[] result = new int[2];
9        for (int num : nums) {
10            if ((num & mask) == 0) {
11                result[0] ^= num; 
12            } else {
13                result[1] ^= num; 
14            }
15        }
16        
17        return result;
18    }
19}