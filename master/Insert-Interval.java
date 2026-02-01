1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        
4        List<int[]> result = new ArrayList<>();
5        int i = 0;
6        int n = intervals.length;
7
8        while (i < n && intervals[i][1] < newInterval[0]) {
9            result.add(intervals[i]);
10            i++;
11        }
12        while (i < n && intervals[i][0] <= newInterval[1]) {
13            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
14            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
15            i++;
16        }
17        result.add(newInterval);
18
19        while (i < n) {
20            result.add(intervals[i]);
21            i++;
22        }
23
24        return result.toArray(new int[result.size()][]);
25    }
26}