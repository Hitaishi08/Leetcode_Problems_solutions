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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null)return false;
        Queue<TreeNode> queue = new LinkedList<>();
        Boolean xfound = false , yfound = false;
        TreeNode xparent = null , yparent = null;
        queue.add(root);

        while(!queue.isEmpty()){
            int len = queue.size();

            for(int i=0;i<len;i++){
                TreeNode curr = queue.poll();

                if(curr.left != null)
                {   
                    if(curr.left.val == x)xparent = curr;
                    if(curr.left.val == y)yparent = curr;

                    queue.offer(curr.left);
                }
                if(curr.right != null)
                {   
                    if(curr.right.val == x)xparent = curr;
                    if(curr.right.val == y)yparent = curr;
                    queue.offer(curr.right);
                }
            }
            if((xparent != null && yparent != null) && (xparent.val != yparent.val))return true;
                else{
                    xparent = null;
                    yparent = null;
                }
        }

        return false;
    }
}