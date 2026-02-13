1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low = 0;
4        int high = 0;
5
6        for(int num:nums){
7            low = Math.max(low , num);
8            high +=num;
9        }
10
11        while(low <= high){
12            int mid = low + (high - low)/2;
13
14            int count = 1;
15            int currentSum = 0;
16
17            for(int num:nums){
18                if(currentSum +num >mid){
19                    count++;
20                    currentSum = 0;
21                }
22                currentSum += num;
23            }
24
25            if(count > k){
26                low = mid + 1;
27            }
28            else{
29                high = mid - 1;
30            }
31        }
32        return low;
33    }
34}