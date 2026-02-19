1class Solution {
2    public String minRemoveToMakeValid(String s) {
3
4        Stack<Integer> st = new Stack<>();
5        boolean[] remove = new boolean[s.length()];
6
7        for (int i = 0; i < s.length(); i++) {
8            if (s.charAt(i) == '(') {
9                st.push(i);
10            } 
11            else if (s.charAt(i) == ')') {
12                if (st.isEmpty()) {
13                    remove[i] = true;   
14                } else {
15                    st.pop();           
16                }
17            }
18        }
19        while (!st.isEmpty()) {
20            remove[st.pop()] = true;
21        }
22
23        StringBuilder sb = new StringBuilder();
24
25        for (int i = 0; i < s.length(); i++) {
26            if (!remove[i]) {
27                sb.append(s.charAt(i));
28            }
29        }
30        return sb.toString();
31    }
32}