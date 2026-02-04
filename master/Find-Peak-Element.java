1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n = nums.length;
4        if(n==0){
5            return 0;
6        }
7
8        int low=0;
9        int high=n-1;
10        int mid = 0;
11        while(low<high){
12            mid= low+(high-low)/2;
13            // if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
14            //     return mid;
15            // }
16            if(nums[mid]<nums[mid+1]){
17                low = mid+1;
18            }
19            else{
20                high = mid;
21            }
22        }
23
24        return low;
25    }
26}