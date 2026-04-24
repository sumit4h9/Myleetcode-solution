1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3
4        if (nums == null || nums.length == 0) return new int[0];
5        int n = nums.length;
6        int[] Maxi = new int[n-k+1];
7        Deque<Integer> q = new ArrayDeque<>();
8
9        for(int i=0; i<n; i++){
10            
11            if(!q.isEmpty() && q.peekFirst() == i-k){
12                q.pollFirst();
13            }
14
15            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
16                q.pollLast();
17            }
18            q.offerLast(i);
19
20            if(i>=k-1){
21                Maxi[i-k+1] = nums[q.peekFirst()];
22            }
23
24        }
25        return Maxi;
26    }
27}