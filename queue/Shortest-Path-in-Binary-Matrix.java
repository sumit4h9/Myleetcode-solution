1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        
4        int n = grid.length;
5
6        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)return -1;
7
8        Queue<int[]> q = new ArrayDeque<>();
9        q.offer(new int[]{0,0});
10
11        grid[0][0] = 1;
12
13        int[][] dir = { {1,0}, {-1,0}, {0,1}, {0,-1}, {1,1}, {-1,1}, {1,-1}, {-1,-1} };
14
15        while(!q.isEmpty()){
16            int[] curr = q.poll();
17
18            int i = curr[0];
19            int j = curr[1];
20
21            int dist = grid[i][j];
22
23            if(i == n-1 && j == n-1)return dist;
24
25            for(int[] d:dir){
26                int ni = d[0] + i;
27                int nj = d[1] + j;
28
29                if(ni<n && nj<n && ni >= 0 && nj >= 0 && grid[ni][nj] == 0){
30
31                    grid[ni][nj] = dist + 1;
32                    q.add(new int[]{ni,nj});
33                }
34            }
35        }
36        return -1;
37    }
38}