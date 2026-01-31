1class Solution {
2    public int[][] generateMatrix(int n) {
3        
4        int top = 0;
5        int bottom = n-1;
6        int left = 0;
7        int right = n-1;
8        int count = 1;
9        int[][] matrix = new int[n][n];
10
11        while(top<=bottom && left<=right){
12            for(int col=left; col<=right; col++){
13                matrix[top][col]=count++;
14            }
15            top++;
16            for(int row=top; row<=bottom ;row++){
17                matrix[row][right]=count++;
18            }
19            right--;
20            
21            if(top<=bottom){
22                for(int col=right ; col>=left; col--){
23                    matrix[bottom][col]=count++;
24                }
25                bottom--;
26            }
27            if(left<=right){
28                for(int row=bottom ; row>=top; row--){
29                    matrix[row][left]=count++;
30                }
31                left++;
32            }
33        }
34        return matrix ;
35    }
36}