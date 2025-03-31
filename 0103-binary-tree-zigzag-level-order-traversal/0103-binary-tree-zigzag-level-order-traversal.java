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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)return result;
        queue.offer(root);
        boolean reverse = false;

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i<levelsize;i++){
                TreeNode currnode = queue.poll();
                if(reverse == false){
                    level.add(currnode.val);
                }else{
                    level.add(0,currnode.val);
                }

                if(currnode.left != null)queue.offer(currnode.left);
                if(currnode.right != null)queue.offer(currnode.right);
            }
            result.add(level);
            reverse = !reverse;
        } 
        return result;
    }
}