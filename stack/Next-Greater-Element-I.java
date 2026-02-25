1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();
4        HashMap<Integer,Integer> hmap = new HashMap<>();
5        int[] result = new int[nums1.length];
6
7        for(int i=0; i<nums2.length; i++){
8            int num = nums2[i];
9            while(!st.isEmpty() && st.peek() < num){
10                int temp = st.pop();
11                hmap.put(temp,num);
12            }
13            st.push(num);
14        }
15
16        while(!st.isEmpty()){
17            int popped = st.pop();
18            hmap.put(popped , -1);
19        }
20        for(int i = 0; i < nums1.length; i++){
21            result[i] = hmap.get(nums1[i]);
22        }
23        return result;
24    }
25}