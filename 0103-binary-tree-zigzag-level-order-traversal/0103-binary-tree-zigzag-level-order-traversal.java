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
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)return result;

        q.offer(root);

        boolean reverse = false;

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<n;i++){
                TreeNode curr = q.poll();
                if(reverse){
                    list.add(0,curr.val);
                }else{
                    list.add(curr.val);
                }

                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
            }

            result.add(list);
            reverse = !reverse;
        }

        return result;
    }
}