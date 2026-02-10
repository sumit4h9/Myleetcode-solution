1class Solution {
2    public boolean search(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0;
5        int high = n - 1;
6
7        while (low <= high) {
8            int mid = low + (high - low) / 2;
9
10            if (nums[mid] == target) {
11                return true;
12            }
13            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
14                low++;
15                high--;
16            }
17            else if (nums[low] <= nums[mid]) {
18                if (nums[low] <= target && target < nums[mid]) {
19                    high = mid - 1;
20                } else {
21                    low = mid + 1;
22                }
23            } else {
24                if (nums[mid] < target && target <= nums[high]) {
25                    low = mid + 1;
26                } else {
27                    high = mid - 1;
28                }
29            }
30        }
31        return false;
32    }
33}