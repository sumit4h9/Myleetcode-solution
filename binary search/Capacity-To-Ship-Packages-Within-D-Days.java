1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int low = 0;
4        int high = 0;
5        for (int w : weights) {
6            low = Math.max(low, w);
7            high += w;
8        }
9
10        while(low<=high){
11            int mid = low + (high -low)/2;
12            int requiredDays = 1;
13            int currentLoad = 0;
14
15            for (int w : weights) {
16                if (currentLoad + w > mid) {
17                    requiredDays++;
18                    currentLoad = 0;
19                }
20                currentLoad += w;
21            }
22
23            if (requiredDays > days) {
24                low = mid + 1;
25            } else {
26                high = mid - 1;  
27            }
28
29        }
30        return low;
31    }
32}