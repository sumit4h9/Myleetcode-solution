1class Solution {
2    public boolean isPalindrome(String s) {
3        int left =0;
4        int right = s.length()-1;
5
6        while(left<right){
7
8            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
9                left++;
10            }
11            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
12                right--;
13            }
14
15            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
16                    return false;
17            }    
18            left++;
19            right--;           
20        }
21        return true;
22    }
23}