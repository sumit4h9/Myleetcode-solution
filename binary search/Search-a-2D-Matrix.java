1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
5        return false;
6
7        int rows = matrix.length;
8        int cols = matrix[0].length;
9
10        int low = 0;
11        int high = rows * cols -1 ;
12
13        while(low <= high){
14            int mid = low + (high - low) / 2;
15
16            int row = mid / cols;
17            int col = mid % cols;
18
19            if(matrix[row][col] == target){
20                return true;
21            }
22            else if(matrix[row][col] < target){
23                low = mid + 1;
24            }
25            else{
26                high = mid -1;
27            }
28        }
29        return false;
30    }
31}