1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Character> st = new Stack<>();
4
5        int score = 0;
6        int depth = 0;
7
8        for(int i=0; i<s.length(); i++){
9            char c = s.charAt(i);
10            if(c=='('){
11                depth++;
12            }
13            else{
14                depth--;
15                if(s.charAt(i-1) == '('){
16                    score += 1 << depth;
17                }
18            }
19        }
20        return score;
21    }
22}