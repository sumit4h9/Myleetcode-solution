1class Solution {
2    public int[] findDiagonalOrder(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int[] result = new int[m*n];
6        int r=0 ,c=0;
7        int dir = 1;
8        int idx =0;
9
10        while(idx < m*n){
11            result[idx++]=mat[r][c];
12
13            if(dir == 1){
14                if( c == n-1 ){
15                    r++;
16                    dir = -1;
17                }
18                else if(r == 0){
19                    c++;
20                    dir = -1;
21                }
22                else{
23                    c++;
24                    r--;
25                }
26            }
27            else{
28                if( r == m-1){
29                    c++;
30                    dir = 1;
31                }
32                else if( c == 0){
33                    r++;
34                    dir = 1;
35                }
36                else{
37                    r++;
38                    c--;
39                }
40            }
41        }
42        return result;
43    }
44}