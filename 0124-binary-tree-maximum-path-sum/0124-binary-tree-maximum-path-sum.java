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
    int max = Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root == null)return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        //if the left or right is negative make it 0
        left = Math.max(0,left);
        right = Math.max(0,right);

        // maintain the path sum
        int pathsum = left + right + root.val;

        // check if the pathsum is greater than the max
        max = Math.max(pathsum,max);

        // return the max path
        return Math.max(left,right) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
}