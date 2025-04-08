/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)return null;

        if(root == q || root == p)return root;

        TreeNode left = null,right = null;

        if(p.val < root.val)
        {
            left = lowestCommonAncestor(root.left,p,q);
        }else{
            right = lowestCommonAncestor(root.right,p,q);
        }

        if(q.val < root.val)
        {
            left = lowestCommonAncestor(root.left,p,q);
        }else{
            right = lowestCommonAncestor(root.right,p,q);
        }

        if(left != null && right != null)return root;

        return (left!=null) ? left : right;
    }
}