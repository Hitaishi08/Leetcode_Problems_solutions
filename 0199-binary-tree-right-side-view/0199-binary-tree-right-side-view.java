/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)return result;

        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        result.add(root.val);

        while(!dq.isEmpty()){
            int len = dq.size();
            for(int i =0;i<len;i++){
                TreeNode currnode = dq.pollFirst();
                if(currnode.left != null)dq.add(currnode.left);
                if(currnode.right != null)dq.add(currnode.right);
            }
            TreeNode rightmost = dq.peekLast();
            if(rightmost != null)result.add(rightmost.val);
        }

        return result;
    }
}