1class Solution {
2    public int mySqrt(int x) {
3
4        int low=1;
5        int high = x;
6        int answer = 0;
7        while(low<=high){
8            int mid = low + (high - low)/2;
9
10            if(mid <= x/mid){
11                answer = mid;
12                low = mid + 1;
13            }
14            else{
15                high = mid -1;
16            }
17        }
18        return answer;
19    }
20}