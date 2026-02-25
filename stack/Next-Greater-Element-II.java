1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5        Arrays.fill(result, -1);
6
7        Stack<Integer> st = new Stack<>();
8        for (int i = 0; i < 2 * n; i++) {
9            int current = nums[i % n];
10
11            while (!st.isEmpty() && nums[st.peek()] < current) {
12                int index = st.pop();
13                result[index] = current;
14            }
15
16            if (i < n) {
17                st.push(i);
18            }
19        }
20
21        return result;
22    }
23}