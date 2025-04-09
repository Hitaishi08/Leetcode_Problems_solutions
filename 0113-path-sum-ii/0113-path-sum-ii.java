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
    public void helper(TreeNode root,int t,List<Integer> list,List<List<Integer>> ans){
        if(root == null)return;

        list.add(root.val);
        if(root.left == null && root.right == null && t == root.val){
            ans.add(new ArrayList<>(list));
        }

        helper(root.left,t-root.val,list,ans);
        helper(root.right,t-root.val,list,ans);

        list.remove(list.size()-1);
       
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root,targetSum,new ArrayList<>(),list);
        return list;
    }
}