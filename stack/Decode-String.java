1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> st = new Stack<>();
4        Stack<String> rt = new Stack<>();
5
6        int currentNum = 0;
7        String currentString = "";
8        for (char ch : s.toCharArray()) {
9
10            if (Character.isDigit(ch)) {
11                currentNum = currentNum * 10 + (ch - '0');
12            } else if (Character.isLetter(ch)) {
13                currentString += ch;
14            } else if (ch == '[') {
15                rt.push(currentString);
16                st.push(currentNum);
17                currentNum = 0;
18                currentString = "";
19            } else if (ch == ']') {
20                String prevString = rt.pop();
21                int count = st.pop();
22                String temp = "";
23                for (int i = 0; i < count; i++) {
24                    temp += currentString;
25                }
26                currentString = prevString + temp;
27            }
28        }
29        return currentString;
30    }
31}