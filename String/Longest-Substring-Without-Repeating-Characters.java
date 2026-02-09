1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet <Character> nus = new HashSet<>();
4        int left = 0;
5        int maxLength =0;
6        for(int right=0; right<s.length(); right++){
7            while (nus.contains(s.charAt(right))) {
8                nus.remove(s.charAt(left));
9                left++;
10            }
11            nus.add(s.charAt(right));
12
13            maxLength = Math.max(maxLength, right - left + 1);
14        }
15        return maxLength;
16    }
17}