1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int n = temperatures.length;
4        int[] result = new int[n];
5
6        Stack<Integer> st = new Stack<>();
7
8        for(int i=0; i<n; i++){
9            int temp = temperatures[i];
10            while(!st.isEmpty() && temp>temperatures[st.peek()]){
11                int previousIndex = st.pop();
12                result[previousIndex] = i - previousIndex;
13            }
14            st.push(i);
15        }
16        return result;
17    }
18}