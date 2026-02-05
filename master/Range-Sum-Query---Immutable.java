1class NumArray {
2    int[] nums;
3    public NumArray(int[] nums) {
4        this.nums = nums;
5    }
6    
7    public int sumRange(int left, int right) {
8        int sum = 0;
9        int n = nums.length;
10
11        for (int k = left; k <= right; k++) {
12            sum += nums[k];
13        }
14
15        return sum;
16    }
17}
18
19/**
20 * Your NumArray object will be instantiated and called as such:
21 * NumArray obj = new NumArray(nums);
22 * int param_1 = obj.sumRange(left,right);
23 */