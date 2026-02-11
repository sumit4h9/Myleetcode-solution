1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        int row = 0;
7        int col = cols -1;
8
9        while(row<rows && col>=0){
10            if(matrix[row][col]==target){
11                return true;
12            }
13            else if(matrix[row][col] > target){
14                col--;
15            }
16            else{
17                row++;
18            }
19        }
20        return false;
21    }
22}