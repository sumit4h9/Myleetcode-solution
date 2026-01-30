1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0;
5        int high = n-1;
6    
7
8        while(low<=high){
9            int mid = low + (high - low)/2;
10
11            if(nums[mid]==target){
12                return mid;
13            }
14            if(nums[low] <= nums[mid]){
15                if(nums[low]<=target && nums[mid] > target){
16                    high = mid -1;
17                }
18                else{
19                    low = mid + 1;
20                }
21            }
22            else{
23                if(nums[mid] < target && target<=nums[high]){
24                    low = mid +1;
25                }
26                else{
27                    high = mid -1;
28                }
29            }
30        }
31        return -1;
32    }
33}