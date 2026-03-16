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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        
19        List<List<Integer>> result = new ArrayList<>();
20        if(root == null)return result;
21
22        Queue<TreeNode> q = new LinkedList<>();
23        q.add(root);
24
25        while(!q.isEmpty()){
26
27            int size = q.size();
28            List<Integer> level = new ArrayList<>();
29
30            for(int i=0; i<size; i++){
31
32                TreeNode node = q.poll();
33                level.add(node.val);
34
35                if(node.left != null) q.add(node.left);
36                if(node.right != null) q.add(node.right);
37            }
38
39            result.add(level);
40        }
41
42        return result;
43    }
44}