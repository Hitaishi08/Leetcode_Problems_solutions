/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public void helper1(TreeNode root,StringBuilder str){
        if(root == null){
            str.append("n,");
            return;
        }

        str.append(root.val).append(",");
        helper1(root.left,str);
        helper1(root.right,str);
    }
    public String serialize(TreeNode root) {
        StringBuilder str = new StringBuilder();
        helper1(root,str);
        return str.toString();
    }

    public TreeNode helper2(Queue<String> nodes){
        String val = nodes.poll();

        if(val.equals("n"))return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));

        node.left = helper2(nodes);
        node.right = helper2(nodes);

        return node;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper2(nodes);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));