1class Solution {
2
3    private int largestRectangleArea(int[] heights) {
4        Stack<Integer> stack = new Stack<>();
5        int maxArea = 0;
6
7        for (int i = 0; i <= heights.length; i++) {
8            int h = (i == heights.length) ? 0 : heights[i];
9
10            while (!stack.isEmpty() && h < heights[stack.peek()]) {
11                int height = heights[stack.pop()];
12                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
13                maxArea = Math.max(maxArea, height * width);
14            }
15
16            stack.push(i);
17        }
18
19        return maxArea;
20    }
21    public int maximalRectangle(char[][] matrix) {
22        if(matrix.length == 0) return 0;
23        int cols = matrix[0].length;
24        int[] heights = new int[cols];
25        int maxArea = 0;
26
27        for(int i=0; i<matrix.length; i++){
28
29            for(int j=0; j<cols; j++){
30                if(matrix[i][j] == '1'){
31                    heights[j] += 1;
32                }
33                else{
34                    heights[j] =0;
35                }
36            }
37            maxArea = Math.max(maxArea , largestRectangleArea(heights));
38        }
39        return maxArea;
40    }
41}