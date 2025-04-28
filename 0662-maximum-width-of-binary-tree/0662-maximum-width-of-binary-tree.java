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
    class Pair{
        TreeNode node;
        int index;

        Pair(TreeNode node,int index){
            this.node = node;
            this.index = index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        List<Pair> queue = new ArrayList<>();

        queue.add(new Pair(root,0));
        int max = 0;
        while(!queue.isEmpty()){
            int size = queue.size();

            Pair first = queue.get(0);
            Pair last = queue.get(queue.size() - 1);

            int leftmost = first.index;
            int rightmost = last.index;

            max = Math.max(max,rightmost-leftmost+1);

            for(int i =0;i<size;i++){
                Pair currnode = queue.remove(0);
                
                int newindex = currnode.index - leftmost;

                if(currnode.node.left != null){
                    Pair newitem = new Pair(currnode.node.left,2*newindex);
                    queue.add(newitem);
                }

                if(currnode.node.right != null){
                    Pair newitem = new Pair(currnode.node.right,2*newindex+1);
                    queue.add(newitem);
                }
            }
        }

        return max;
    }
}