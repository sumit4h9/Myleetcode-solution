1class Solution {
2    public int orangesRotting(int[][] grid) {
3        Queue<int[]> q = new LinkedList<>();
4
5        int fresh = 0;
6        int minutes  = 0;
7        
8        int n = grid.length;
9        int m = grid[0].length;
10
11        for(int i=0; i<n; i++){
12            for(int j=0; j<m; j++){
13                if(grid[i][j] == 2){
14                    q.add(new int[]{i,j});
15                }
16
17                if(grid[i][j] == 1){
18                    fresh++;
19                }
20            }
21        }
22
23        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
24
25        while(!q.isEmpty() && fresh>0){
26            int size = q.size();
27
28            for(int i=0; i<size; i++){
29                int[] curr = q.poll();
30
31                for(int[] d: dir){
32
33                    int r = curr[0] + d[0];
34                    int c = curr[1] + d[1];
35
36                    if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
37
38                        grid[r][c] = 2;
39                        fresh--;
40                        q.add(new int[]{r,c});
41                    }
42                }
43            }
44            minutes++;
45        }
46        return fresh==0 ? minutes : -1;
47    }
48}