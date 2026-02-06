1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        int prefix[] = new int[]{m,n};
4        for(int[] op:ops){
5            prefix[0] = Math.min(prefix[0] , op[0]);
6            prefix[1] = Math.min(prefix[1] , op[1]);
7        }
8        return prefix[0]*prefix[1];
9    }
10}