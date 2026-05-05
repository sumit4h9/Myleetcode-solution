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
17    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
18        
19        if(root1 == null)return root2;
20        if(root2 == null)return root1;
21
22        TreeNode newNode = new TreeNode(root1.val + root2.val);
23
24        newNode.left = mergeTrees(root1.left , root2.left);
25        newNode.right = mergeTrees(root1.right , root2.right);
26
27        return newNode;
28    }
29}