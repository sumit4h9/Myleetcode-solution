1class Solution {
2    public int evalRPN(String[] tokens) {
3        int result = 0;
4        Stack<Integer> st = new Stack<>();
5
6        for(int i=0; i<tokens.length; i++){
7            String c = tokens[i];
8            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
9                int temp1 = st.pop();
10                int temp2 = st.pop();
11                
12                if (c.equals("+")) result = temp2 + temp1;
13                else if (c.equals("-")) result = temp2 - temp1;
14                else if (c.equals("*")) result = temp2 * temp1;
15                else result = temp2 / temp1;
16                st.push(result);
17                
18            }
19            else{
20                st.push(Integer.parseInt(c));
21            }
22        }
23        return st.pop();
24    }
25}