1class Solution {
2    public int sumSubarrayMins(int[] arr) {
3        int n = arr.length;
4        long mod = 1000000007;
5        long result = 0;
6
7        Stack<Integer> st = new Stack<>();
8        int[] left = new int[n];
9        int[] right = new int[n];
10
11        for (int i = 0; i < n; i++) {
12            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
13                st.pop();
14            }
15            left[i] = st.isEmpty() ? i + 1 : i - st.peek();
16            st.push(i);
17        }
18
19        st.clear();
20        
21        for (int i = n - 1; i >= 0; i--) {
22            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
23                st.pop();
24            }
25            right[i] = st.isEmpty() ? n - i : st.peek() - i;
26            st.push(i);
27        }
28        
29        for (int i = 0; i < n; i++) {
30            result = (result + (long)arr[i] * left[i] * right[i]) % mod;
31        }
32        
33        return (int) result;
34
35    }
36}