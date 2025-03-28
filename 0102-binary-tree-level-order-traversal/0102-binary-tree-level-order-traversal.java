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
    public List<List<Integer>> BFS(Queue<TreeNode> queue,List<List<Integer>> result){

        //base case:
        if(queue.isEmpty())return result;

        List<Integer> list = new ArrayList<>();
        int size = queue.size();

        //running the loop to add all the level elements
        for(int i=0;i<size;i++){
            // remove the node from the queue:
            TreeNode node = queue.poll();

            //add the value in the list
            list.add(node.val);

            // add the left and right child of the node in the queue:
            if(node.left != null)queue.offer(node.left);
            if(node.right != null)queue.offer(node.right);
        }

        // add the list in result
        result.add(list);

        //make a recursive call
        return BFS(queue,result);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null)return result;
        //add the root node in the qeueu:
        queue.add(root);

        return BFS(queue,result);
    }
}