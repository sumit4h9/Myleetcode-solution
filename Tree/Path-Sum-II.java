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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> result = new ArrayList<>();
19        List<Integer> currentpath = new ArrayList<>();
20        pathfind(root , targetSum , result , currentpath);
21        return result;
22    }
23
24    private void pathfind(TreeNode node , int sum , List<List<Integer>> result, List<Integer> currentpath){
25        if(node == null)return;
26
27        currentpath.add(node.val);
28
29        if(node.left == null && node.right == null && sum == node.val){
30            result.add(new ArrayList<>(currentpath));
31        }
32        else{
33            pathfind(node.left , sum-node.val , result , currentpath);
34            pathfind(node.right , sum-node.val , result , currentpath);
35        }
36
37        currentpath.remove(currentpath.size() -1);
38
39    }
40}