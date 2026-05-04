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
17    public int pathSum(TreeNode root, int targetSum) {
18        Map<Long , Integer> prefixSumMap = new HashMap<>();
19        prefixSumMap.put(0L,1);
20        return dfs(root, 0L, targetSum, prefixSumMap);
21    }
22
23    private int dfs(TreeNode node ,long currsum , int target , Map<Long, Integer> map){
24        if(node == null)return 0;
25
26        currsum += node.val;
27
28        int count = map.getOrDefault(currsum - target, 0);
29
30        map.put(currsum, map.getOrDefault(currsum, 0) + 1);
31        count += dfs(node.left, currsum, target, map);
32        count += dfs(node.right, currsum, target, map);
33
34        map.put(currsum, map.get(currsum) - 1);
35        return count;
36    }
37}