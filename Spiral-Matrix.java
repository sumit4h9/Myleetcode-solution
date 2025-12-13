1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        
4        List<Integer> result = new ArrayList<>();
5
6        if(matrix ==null || matrix.length==0)return result;
7
8        int top = 0;
9        int bottom = matrix.length-1;
10        int left = 0;
11        int right = matrix[0].length-1;
12
13        while(top<=bottom && left<=right){
14            
15            for(int col =left; col<=right ;col++ ){
16                result.add(matrix[top][col]);
17            }
18            top++;
19            for(int row =top; row<=bottom ;row++){
20                result.add(matrix[row][right]);
21            }
22            right--;
23            if(top<=bottom){
24                for(int col=right ; col>=left; col--){
25                    result.add(matrix[bottom][col]);
26                }
27                bottom--;
28            }
29
30            if(left<=right){
31                for(int row=bottom ; row>=top; row--){
32                    result.add(matrix[row][left]);
33                }
34                left++;
35            }
36        }
37        return result;
38    }
39}