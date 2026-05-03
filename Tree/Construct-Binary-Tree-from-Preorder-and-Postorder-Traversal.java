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
18    int postIdx = 0;
19    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
20        TreeNode root = new TreeNode(preorder[preIdx++]);
21
22        if(root.val != postorder[postIdx]){
23            root.left = constructFromPrePost(preorder , postorder);
24        }
25
26        if(root.val != postorder[postIdx]){
27            root.right = constructFromPrePost(preorder , postorder);
28        }
29
30        postIdx++;
31        return root;
32    }
33}