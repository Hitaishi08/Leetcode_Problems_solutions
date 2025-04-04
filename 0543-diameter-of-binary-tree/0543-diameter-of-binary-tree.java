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

    public int finddiameter(TreeNode node,int[] diameter){
        if(node == null){
            return 0;
        }

        int leftheight = finddiameter(node.left,diameter);
        int rightheight = finddiameter(node.right,diameter);

        int dia = leftheight + rightheight;
        diameter[0] = Math.max(dia,diameter[0]);

        return Math.max(leftheight,rightheight)+ 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        finddiameter(root,diameter);
        return diameter[0];
    }
}