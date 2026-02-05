1class Solution {
2    public int findMaxLength(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        int longest =0;
6        HashMap<Integer, Integer> hashMap = new HashMap<>();
7        hashMap.put(0,-1);
8        for(int i=0; i<n; i++){
9            if(nums[i]==0){
10                nums[i]=-1;
11            }
12            sum +=nums[i];
13            if(hashMap.containsKey(sum)){
14                int k = hashMap.get(sum);
15                longest = Math.max(longest,i-k);
16            }
17            else{
18                hashMap.put(sum,i);
19            }
20        }
21    
22        return longest;
23    }
24}