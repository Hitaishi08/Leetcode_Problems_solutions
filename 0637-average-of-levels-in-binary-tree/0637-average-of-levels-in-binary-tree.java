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
    // level = BFS
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null)return result;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            Double sum = 0d;
            for(int i =0;i<size;i++){
                TreeNode currnode = queue.poll();
                sum += currnode.val;
                if(currnode.left != null)queue.offer(currnode.left);
                if(currnode.right != null)queue.offer(currnode.right);
            }
            result.add(sum/size);
        }

        return result;
    }
}