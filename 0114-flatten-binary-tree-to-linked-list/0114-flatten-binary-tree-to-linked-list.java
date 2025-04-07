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
    public void addelement(Queue<TreeNode> q,TreeNode root){
        if(root == null)return;

        q.offer(root);
        addelement(q,root.left);
        addelement(q,root.right);
    }
    public void flatten(TreeNode root) {
        if(root == null)return;
        Queue<TreeNode> queue = new LinkedList<>();
        addelement(queue,root);
        queue.poll();
        TreeNode curr = root;
        while(!queue.isEmpty()){
            curr.right = queue.poll();
            curr.left = null;
            curr = curr.right;
        }
    }
}