1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n = nums.length;
4        int totalsum = 0;
5        
6        for(int num:nums){
7            totalsum += num;
8        }
9        int leftsum = 0;
10        for(int i=0;i<n;i++){
11            int rightsum = totalsum - leftsum - nums[i];
12            if(leftsum==rightsum){
13                return i;
14            }
15            leftsum +=nums[i];
16        }
17        return -1;
18    }
19}