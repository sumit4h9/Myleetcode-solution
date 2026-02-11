1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3        
4        int low = 1;
5        int high = 0;
6
7        for(int num:nums){
8            high = Math.max(high , num);
9        }
10
11        int answer = high;
12
13        while(low <= high){
14            int mid = low + (high - low)/2;
15
16            int sum = 0;
17
18            
19            for (int num : nums) {
20                sum += (num + mid - 1) / mid;
21            }
22
23            if (sum > threshold) {
24                low = mid + 1;
25            } 
26            else {
27                answer = mid;
28                high = mid - 1;
29            }
30        }
31        return answer;
32    }
33}