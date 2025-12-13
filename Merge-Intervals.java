1class Solution {
2    public int[][] merge(int[][] intervals) {
3        if(intervals.length<=1){
4            return intervals;
5        }
6
7        Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
8
9        List<int[]> result = new ArrayList<>();
10
11        int[] current = intervals[0];
12        result.add(current);
13
14        for(int i=1; i<intervals.length; i++){
15            int[] next =intervals[i];
16
17            if(next[0] <= current[1]){
18                current[1]=Math.max(current[1],next[1]);
19            }
20            else{
21                current = next;
22                result.add(current);
23            }
24        }
25        return result.toArray(new int[result.size()][]);
26    }
27}