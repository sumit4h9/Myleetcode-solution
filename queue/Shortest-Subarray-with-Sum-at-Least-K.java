1class Solution {
2    public int shortestSubarray(int[] nums, int k) {
3        int n = nums.length;
4        long[] prefix = new long[n+1];
5        for(int i=0; i<n ; i++)prefix[i+1] = prefix[i] + nums[i];
6
7        Deque<Integer> dq = new ArrayDeque<>();
8        int minLen = n+1;
9        
10
11        for(int j=0; j<=nums.length ; j++){
12
13
14            while(!dq.isEmpty() && prefix[j]-prefix[dq.peekFirst()] >= k){
15                minLen = Math.min(minLen , j - dq.pollFirst());
16            }
17            
18
19            while(!dq.isEmpty() && prefix[j] <= prefix[dq.peekLast()]){
20                dq.pollLast();
21            }
22            dq.offerLast(j);
23
24        }
25        return minLen > n ? -1 : minLen;
26    }
27}