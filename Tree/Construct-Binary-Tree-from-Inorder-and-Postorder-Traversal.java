1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    int postIdx;
19    Map<Integer , Integer> inMap = new HashMap<>();
20
21    public TreeNode buildTree(int[] inorder, int[] postorder){
22        postIdx = postorder.length -1 ;
23        
24        for(int i=0; i<inorder.length; i++){
25            inMap.put(inorder[i],i);
26        }
27
28        return helper(postorder , 0 ,inorder.length-1);
29    }
30
31    private TreeNode helper(int[] postorder , int inStart, int inEnd){
32        if(inStart > inEnd)return null;
33
34        int rootval = postorder[postIdx--];
35        TreeNode root = new TreeNode(rootval);
36
37        int mid = inMap.get(rootval);
38
39        root.right = helper(postorder , mid+1 , inEnd);
40        root.left = helper(postorder , inStart , mid-1);
41
42        return root;
43    }
44}