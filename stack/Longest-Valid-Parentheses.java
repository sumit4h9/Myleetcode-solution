1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        int max = 0;
5        int boundary = -1;
6
7        for(int i = 0; i<s.length(); i++){
8            char c = s.charAt(i);
9            int length =0;
10            if(c=='(' ){
11                st.push(i);
12            }
13            else if(c==')'){
14                if(st.isEmpty()){
15                    boundary = i;
16                }
17                else{
18                    st.pop();
19                    if(st.isEmpty()){
20                        length = i - boundary;
21                        max = Math.max(max, length);
22                    }
23                    else{
24                        length = i - st.peek();
25                        max = Math.max(max, length);
26                    }
27                }
28            }
29        }
30        return max;
31    }
32}