1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4
5        int low = 0;
6        int high = n-1;
7
8        while(low<=high){
9            int mid = low + (high - low)/2;
10
11            if(nums[mid]==target){
12                return mid;
13            }
14            else if(nums[mid]<target){
15                low = mid + 1;
16            }
17            else{
18                high = mid - 1;
19            }
20        }
21        return -1;
22    }
23}