1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4
5        int[] result = new int[n];
6        int low = 0, high = n-1;
7        int index = n-1;
8
9        while(low<=high){
10            int leftsq=nums[low]*nums[low];
11            int rightsq=nums[high]*nums[high];
12
13            if(leftsq > rightsq){
14                result[index--]=leftsq;
15                low++;
16            }
17            else{
18                result[index--]=rightsq;
19                high--;
20            }
21        }
22        return result;
23        
24    }
25}