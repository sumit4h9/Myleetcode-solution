1class Solution {
2    public String removeKdigits(String num, int k) {
3        Stack<Character> st = new Stack<>();
4
5        for(char digit :num.toCharArray()){
6
7            while(k>0 && !st.isEmpty() && st.peek() > digit){
8                st.pop();
9                k--;
10            }
11            st.push(digit);
12        }
13
14        while(k > 0) {
15            st.pop();
16            k--;
17        }
18
19        StringBuilder sb = new StringBuilder();
20        for(char digit : st) {
21            sb.append(digit);
22        }
23
24        while(sb.length() > 1 && sb.charAt(0) == '0') {
25            sb.deleteCharAt(0);
26        }
27
28        return sb.length() == 0 ? "0" : sb.toString();
29    }
30}