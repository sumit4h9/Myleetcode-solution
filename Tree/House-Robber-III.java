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
17    public int rob(TreeNode root) {
18        int[] result = robHelper(root);
19        return Math.max(result[0], result[1]);
20    }
21    private int[] robHelper(TreeNode node) {
22        if (node == null) {
23            return new int[]{0, 0};
24        }
25
26        int[] left = robHelper(node.left);
27        int[] right = robHelper(node.right);
28
29        int[] result = new int[2];
30
31        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
32
33        result[1] = node.val + left[0] + right[0];
34
35        return result;
36    }
37}