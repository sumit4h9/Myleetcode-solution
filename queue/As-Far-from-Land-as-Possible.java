1class Solution {
2    public int maxDistance(int[][] grid) {
3        int n = grid.length;
4        Queue<int[]> q = new ArrayDeque<>();
5
6        for(int i=0; i<n; i++){
7            for(int j=0; j<n; j++){
8                if(grid[i][j]==1)q.offer(new int[]{i,j});
9            }
10        }
11
12        if(q.isEmpty() || q.size()== n*n)return -1;
13
14        int[][] dis = {{0,1},{1,0},{-1,0},{0,-1}};
15        int distance = -1;
16
17        while(!q.isEmpty()){
18            int size = q.size();
19            distance++;
20
21            for(int i=0; i<size; i++){
22                int[] curr= q.poll();
23
24                for(int[] d:dis){
25                    int n1 = d[0] + curr[0];
26                    int n2 = d[1] + curr[1];
27
28                    if(n1<n && n2<n && n1>=0 && n2>=0 && grid[n1][n2] == 0){
29                        grid[n1][n2] = 1;
30                        q.offer(new int[]{n1,n2});
31                    }
32                }
33            }
34        }
35        return distance;
36    }
37}