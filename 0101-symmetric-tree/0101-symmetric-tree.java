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
    public boolean check(TreeNode leftnode,TreeNode rightnode){
        if(leftnode == null && rightnode == null)return true;
        if((leftnode != null && rightnode == null) || (leftnode == null && rightnode != null))return false;

        if(leftnode.val != rightnode.val)return false;

        return check(leftnode.left,rightnode.right) && check(leftnode.right,rightnode.left);
    }

    public boolean isSymmetric(TreeNode root) {
        // Queue<TreeNode> queue = new LinkedList<>();
        // if(root == null)return true;

        // queue.offer(root.left);
        // queue.offer(root.right);

        // while(!queue.isEmpty()){
        //     TreeNode left = queue.poll();
        //     TreeNode right = queue.poll();

        //     if(left == null && right == null)continue;
        //     if((left != null && right == null) || (left == null && right != null))return false;
        //     if(left.val != right.val)return false;

        //     queue.offer(left.left);
        //     queue.offer(right.right);
        //     queue.offer(left.right);
        //     queue.offer(right.left);
        // }

        // return true;

        return check(root.left,root.right);
    }
}