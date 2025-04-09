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
    public int count=0;
    public void helper(TreeNode root,int t,long sum,List<Long>list){
        if(root == null) return;

        sum += root.val;

        if(sum == t)count++;

        if(!list.isEmpty()){
            for(long ele : list){
                if(sum  - ele == t)count++;
            }
            // return count;
        }

        list.add(sum);
        helper(root.left,t,sum,list);
        helper(root.right,t,sum,list);
        list.remove(list.size() - 1);

        // return left + right;
    }
    public int pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,0,new ArrayList<>());
        return count;
    }
}