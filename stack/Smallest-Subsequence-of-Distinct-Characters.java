1class Solution {
2    public String smallestSubsequence(String s) {
3        Stack<Character> st = new Stack<>();
4        int[] last = new int[26];
5        boolean[] visited = new boolean[26];
6
7        for(int i=0; i<s.length(); i++){
8            last[s.charAt(i)-'a'] = i ;
9        }
10        
11        for(int i=0; i<s.length(); i++){
12            char ch = s.charAt(i);
13
14            if (visited[ch - 'a']) continue;
15
16            while(!st.isEmpty() && last[st.peek() - 'a'] > i && st.peek() > ch){
17                char poppedChar=st.pop();
18                visited[poppedChar - 'a'] = false;
19            }
20            st.push(ch);
21            visited[ch - 'a'] = true;
22        }
23        StringBuilder sb = new StringBuilder();
24        for (char c : st) {
25            sb.append(c);
26        }
27        return sb.toString();
28
29    }
30}