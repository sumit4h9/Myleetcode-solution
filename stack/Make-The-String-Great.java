1class Solution {
2    public String makeGood(String s) {
3        Stack<Character> st = new Stack<>();
4
5        for(char c:s.toCharArray()){
6            if(!st.isEmpty() && Math.abs(st.peek() - c) ==32 ){
7                st.pop();
8            }
9            else{
10                st.push(c);
11            }
12        } 
13        StringBuilder sb = new StringBuilder();
14        for (char c : st) {
15            sb.append(c);
16        }
17        return sb.toString();
18    }
19}