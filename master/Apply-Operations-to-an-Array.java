1class Solution {
2    public int[] applyOperations(int[] nums) {
3        int k = 0;
4
5        for(int i = 0; i < nums.length-1; i++){
6            if(nums[i] == nums[i+1]){
7                nums[i] = nums[i]*2;
8                nums[i+1] = 0;
9            }
10        }
11        for(int i = 0; i < nums.length; i++){
12            if(nums[i] != 0 ){
13                nums[k++]=nums[i];
14            }
15        }
16        while(k < nums.length){
17            nums[k++] = 0;
18        }
19        return nums;
20    }
21}