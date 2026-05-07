1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        StringBuilder sb = new StringBuilder();
15        serializeHelper(root, sb);
16        return sb.toString();
17    }
18
19    private void serializeHelper(TreeNode node, StringBuilder sb) {
20        if (node == null) {
21            sb.append("N,"); 
22            return;
23        }
24        sb.append(node.val).append(","); 
25        serializeHelper(node.left, sb);  
26        serializeHelper(node.right, sb); 
27    }
28
29    public TreeNode deserialize(String data) {
30        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
31        return deserializeHelper(nodes);
32    }
33
34    private TreeNode deserializeHelper(Queue<String> nodes) {
35        String val = nodes.poll();
36        if (val.equals("N")) return null;
37
38        TreeNode node = new TreeNode(Integer.parseInt(val));
39        node.left = deserializeHelper(nodes);  // Rebuild Left
40        node.right = deserializeHelper(nodes); // Rebuild Right
41        return node;
42    }
43}
44
45// Your Codec object will be instantiated and called as such:
46// Codec ser = new Codec();
47// Codec deser = new Codec();
48// TreeNode ans = deser.deserialize(ser.serialize(root));