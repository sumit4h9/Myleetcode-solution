1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int n = nums.length;
4        int low = 0;
5        int high = n;
6        int[] fin = {-1,-1};
7
8        fin[0] = first(nums, target);
9        fin[1] = last(nums, target);
10        return fin;
11    }
12
13    private int first(int[] nums, int target){
14        int low = 0, high = nums.length-1;
15        int res =-1;
16        
17        while(low<=high){
18            int mid = low + (high - low)/2;
19
20            if(nums[mid]==target){
21                res = mid;
22                high = mid-1;
23            }
24            else if(nums[mid] < target){
25                low = mid+1;
26            }
27            else{
28                high = mid-1;
29            }
30        }
31        return res;
32    }
33
34    private int last(int[] nums, int target){
35        int low = 0, high = nums.length-1;
36        int res =-1;
37        
38        while(low<=high){
39            int mid = low + (high - low)/2;
40
41            if(nums[mid]==target){
42                res = mid;
43                low = mid+1;
44            }
45            else if(nums[mid] < target){
46                low = mid+1;
47            }
48            else{
49                high = mid-1;
50            }
51        }
52        return res;
53    }
54}