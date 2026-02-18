1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        return build(s).equals(build(t));
4    }
5
6    public String build(String str){
7        Stack<Character> st = new Stack<>();
8
9        for(char c: str.toCharArray()){
10            if(c != '#'){
11                st.push(c);
12            }
13            else if (!st.isEmpty()){
14                st.pop();
15            }
16        }
17        return String.valueOf(st);
18    }
19}