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
    public void helper(TreeNode root,List<String> list,String str){
        if(root == null)return;

        str += root.val + "->";
        if(root.left == null && root.right == null){
            str = str.substring(0, str.length() - 2);
            list.add(str);
        }

        helper(root.left,list,str);
        helper(root.right,list,str);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root,list,"");
        return list;
    }
}