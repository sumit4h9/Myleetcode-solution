1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack = new Stack<>();
4        int currentNumber = 0;
5        char operation = '+'; 
6
7        for (int i = 0; i < s.length(); i++) {
8            char c = s.charAt(i);
9
10            // Build multi-digit number
11            if (Character.isDigit(c)) {
12                currentNumber =currentNumber * 10 + (c - '0');
13            }
14
15            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
16
17                if (operation == '+') {
18                    stack.push(currentNumber);
19                }
20                else if (operation == '-') {
21                    stack.push(-currentNumber);
22                }
23                else if (operation == '*') {
24                    stack.push(stack.pop() * currentNumber);
25                }
26                else if (operation == '/') {
27                    stack.push(stack.pop() / currentNumber);
28                }
29
30                operation = c;
31                currentNumber = 0;
32            }
33        }
34
35        int result = 0;
36        while (!stack.isEmpty()) {
37            result += stack.pop();
38        }
39
40        return result;
41
42    }
43}