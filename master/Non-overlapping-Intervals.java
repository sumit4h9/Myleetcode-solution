1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int n = intervals.length;
4        int count = 0 ;
5
6        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
7        int prevEnd = intervals[0][1];
8        for(int i=1; i<n; i++){
9            // int[] current = intervals[i-1];
10            if(intervals[i][0] < prevEnd){
11                count++;
12            }
13            else{
14                prevEnd = intervals[i][1];
15            }
16        }
17        return count;
18    }
19}