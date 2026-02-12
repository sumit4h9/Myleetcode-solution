1class Solution {
2    public int findKthNumber(int m, int n, int k) {
3        int low = 1;
4        int high = m * n;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8
9            int count = 0;
10
11            for (int i = 1; i <= m; i++) {
12                count += Math.min(n, mid / i);
13            }
14
15            if (count < k) {
16                low = mid + 1;   
17            } else {
18                high = mid - 1;  // Try smaller possible answer
19            }
20        }
21
22        return low;
23    }
24}
25