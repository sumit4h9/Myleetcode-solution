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
17    int maxSum = Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        dfs(root);
20        return maxSum;
21    }
22
23    private int dfs(TreeNode node){
24        if(node == null)return 0;
25
26        int left = Math.max(0,dfs(node.left));
27        int right = Math.max(0,dfs(node.right));
28
29        int currentsum = left + right + node.val;
30
31        maxSum = Math.max(maxSum , currentsum);
32
33        return node.val + Math.max(left , right);
34    }
35}
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68