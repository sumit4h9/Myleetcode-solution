1class Solution {
2    public void rotate(int[][] matrix) {
3        // int m = matrix.length;
4        int n = matrix[0].length;
5
6        for(int i=0; i<n; i++){
7            for(int j=i+1; j<n; j++){
8                int temp = matrix[i][j];
9                matrix[i][j] = matrix[j][i];
10                matrix[j][i] = temp;
11            }
12        }
13        for (int i = 0; i < n; i++) {
14            int left = 0, right = n - 1;
15            while (left < right) {
16                int temp = matrix[i][left];
17                matrix[i][left] = matrix[i][right];
18                matrix[i][right] = temp;
19                left++;
20                right--;
21            }
22        }
23    }
24}