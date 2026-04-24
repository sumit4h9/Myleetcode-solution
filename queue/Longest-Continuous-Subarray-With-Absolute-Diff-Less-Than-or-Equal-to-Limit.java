1class Solution {
2    public int longestSubarray(int[] nums, int limit) {
3        Deque<Integer> maxdq = new ArrayDeque<>();
4        Deque<Integer> mindq = new ArrayDeque<>();
5
6        int i=0,res=0;
7
8        for(int j=0; j<nums.length ; j++){
9
10            while(!maxdq.isEmpty() && nums[maxdq.peekLast()]<nums[j]){
11                maxdq.pollLast();
12            }
13            maxdq.offerLast(j);
14
15            while(!mindq.isEmpty() && nums[mindq.peekLast()]>nums[j]){
16                mindq.pollLast();
17            }
18            mindq.offerLast(j);
19
20            while(nums[maxdq.peekFirst()] - nums[mindq.peekFirst()] > limit){
21                if(maxdq.peekFirst() == i)maxdq.pollFirst();
22                if(mindq.peekFirst() == i)mindq.pollFirst();
23                i++;
24            }
25
26            res = Math.max(res, j-i+1); 
27        }
28        return res;
29    }
30}