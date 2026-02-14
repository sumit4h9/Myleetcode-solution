1class Solution {
2    public int minDays(int[] bloomDay, int m, int k) {
3        
4        if(bloomDay.length < (long)m*k){
5            return -1;
6        }
7        
8        int low = Integer.MAX_VALUE;
9        int high = Integer.MIN_VALUE;
10
11        for(int day: bloomDay){
12            low = Math.min(low , day);
13            high = Math.max(high , day);
14        }
15
16        while (low <= high) {
17
18            int mid = low + (high - low) / 2;
19
20            if (canMake(bloomDay, m, k, mid)) {
21                high = mid - 1;
22            } else {
23                low = mid + 1;
24            }
25        }
26
27        return low;
28
29
30    }
31
32    private boolean canMake(int[] bloomDay, int m, int k, int day){
33        int bouquets = 0;
34        int flower = 0;
35
36        for(int bloom: bloomDay){
37            if(bloom <= day){
38                flower++;
39                if(flower==k){
40                    bouquets++;
41                    flower = 0;
42                }
43            }
44            else{
45                flower = 0; 
46            }
47        }
48        return bouquets >= m;
49    }
50}