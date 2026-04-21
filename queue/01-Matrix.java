1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int rows = mat.length;
4        int cols = mat[0].length;
5
6        Queue<int[]> q = new ArrayDeque<>();
7
8        for(int i=0; i<rows; i++){
9            for(int j=0; j<cols; j++){
10                if(mat[i][j] == 0){
11                    q.add(new int[]{i,j});
12                }
13                else{
14                    mat[i][j] = -1;
15                }
16            }
17        }
18
19        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
20
21        while(!q.isEmpty()){
22            int[] curr = q.poll();
23
24            for(int[] d:dir){
25                int n1 = curr[0] + d[0];
26                int n2 = curr[1] + d[1];
27
28                if(n1 >= 0 && n2 >=0 && n1<rows && n2<cols && mat[n1][n2] == -1){
29                    mat[n1][n2] = mat[curr[0]][curr[1]]+1;
30                    q.add(new int[]{n1,n2});
31                }
32            }
33        }
34        return mat;
35    }
36}