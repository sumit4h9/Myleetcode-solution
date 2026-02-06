1class Solution {
2    public int[] corpFlightBookings(int[][] bookings, int n) {
3        int[] total = new int[n];
4        for(int[] booking:bookings){
5            int startidx = booking[0];
6            int lastidx = booking[1];
7            int val = booking[2];
8
9            total[startidx-1]+=val;
10            if(lastidx+1 <=n){
11                total[lastidx]-=val;
12            }
13
14        }
15        
16        for(int i=1; i<n; i++){
17            total[i] += total[i-1];
18        }
19        return total;
20    }
21}