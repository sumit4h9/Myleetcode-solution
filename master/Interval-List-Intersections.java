1class Solution {
2    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
3        int i = 0, j = 0;
4        List<int[]> result = new ArrayList<>();
5        
6        while( i < firstList.length && j < secondList.length){
7            
8            int start = Math.max(firstList[i][0], secondList[j][0]);
9            int end = Math.min(firstList[i][1],secondList[j][1]);
10            if(start<=end){
11                result.add(new int[]{start, end});
12            }
13            if (firstList[i][1] < secondList[j][1]) {
14                i++;
15            } else {
16                j++;
17            }
18        }
19        return result.toArray(new int[result.size()][]);
20    }
21}