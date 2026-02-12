1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int max = 0;
4        for (int pile : piles) {
5            max = Math.max(max, pile);
6        }
7
8        int low = 1;
9        int high = max;
10
11        while(low<=high){
12            int mid = low + (high -low)/2;
13            long hours = 0;
14
15            for (int pile : piles) {
16                hours += (pile + mid - 1) / mid;
17            }
18
19            if (hours > h) {
20                low = mid + 1;   
21            } else {
22                high = mid - 1;  
23            }
24        }
25
26        return low;
27    }
28}