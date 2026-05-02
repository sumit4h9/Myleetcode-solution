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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> result = new ArrayList<>();
19        if(root == null)return result;
20
21        Queue<TreeNode> q = new LinkedList<>();
22        q.offer(root);
23        boolean lefttoright = true;
24
25        while(!q.isEmpty()){
26            int size = q.size();
27            LinkedList<Integer> level = new LinkedList<>();
28            
29            for(int i=0;i<size;i++){
30                TreeNode curr = q.poll();
31
32                if(lefttoright){
33                    level.addLast(curr.val);
34                }
35                else{
36                    level.addFirst(curr.val);
37                }
38
39                if(curr.left != null) q.offer(curr.left);
40                if(curr.right != null) q.offer(curr.right);
41            }
42            result.add(level);
43            lefttoright = !lefttoright;
44
45        }
46        return result;
47    }
48}