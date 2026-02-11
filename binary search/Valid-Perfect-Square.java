1class Solution {
2    public boolean isPerfectSquare(int num) {
3        if(num == 1) return true;
4        long low = 1;
5        long high = num;
6
7        while( low <= high ){
8            long mid = low + (high - low)/2;
9            long square = mid * mid;
10            if(num == square){
11                return true;
12            }
13            else if(num > square){
14                low = mid + 1;
15            }
16            else{
17                high = mid - 1;
18            }
19        }
20        return false;
21    }
22}