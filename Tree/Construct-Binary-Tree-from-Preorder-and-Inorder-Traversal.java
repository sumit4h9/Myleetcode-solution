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
17    int preIdx = 0;
18    Map<Integer , Integer>  inMap = new HashMap<>();
19
20    public TreeNode buildTree(int[] preorder, int[] inorder) {
21        
22        for(int i=0;i<inorder.length;i++){
23            inMap.put(inorder[i],i);
24        }
25        return helper(preorder , 0 , inorder.length-1);
26    }
27
28    private TreeNode helper(int[] preorder , int inStart, int inEnd){
29        if(inStart > inEnd)return null;
30
31        int rootVal = preorder[preIdx++];
32        TreeNode root = new TreeNode(rootVal);
33
34        int inIdx = inMap.get(rootVal);
35
36        root.left = helper(preorder , inStart ,inIdx-1);
37        root.right = helper(preorder, inIdx+1, inEnd);
38
39        return root;
40    } 
41}