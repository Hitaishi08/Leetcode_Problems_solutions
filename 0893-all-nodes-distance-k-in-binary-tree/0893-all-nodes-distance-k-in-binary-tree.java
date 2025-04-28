/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void storingParentNodes(TreeNode root,HashMap<TreeNode,TreeNode> parentmap){
        //going to use BFS to store the parents node
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i =0;i<size;i++){
                TreeNode currnode = queue.poll();

                if(currnode.left != null){
                    parentmap.put(currnode.left,currnode);
                    queue.offer(currnode.left);
                }

                if(currnode.right != null){
                    parentmap.put(currnode.right,currnode);
                    queue.offer(currnode.right);
                }
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // if you have to traverse back in tree use map to store upward nodes
        HashMap<TreeNode,TreeNode> parentmap = new HashMap<>();

        storingParentNodes(root,parentmap);

        //visited map so we don't go back/upward to visited nodes
        HashMap<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        List<Integer> ans = new ArrayList<>();
        int curr_level = 0;

        visited.put(target,true);
        queue.offer(target);

        while(!queue.isEmpty()){
            int size = queue.size();
            if(curr_level == k)break;

            for(int i =0;i<size;i++){
                TreeNode currnode = queue.poll();

                if(currnode.left != null && visited.get(currnode.left) == null){
                    visited.put(currnode.left,true);
                    queue.offer(currnode.left);
                }

                if(currnode.right != null && visited.get(currnode.right) == null){
                    visited.put(currnode.right,true);
                    queue.offer(currnode.right);
                }

                TreeNode parentNode = parentmap.get(currnode);

                if(parentNode != null && visited.get(parentNode) == null){
                    visited.put(parentNode,true);
                    queue.offer(parentNode);
                }
            }
            curr_level+=1;
        }

        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            ans.add(curr.val);
        }

        return ans;
    }
}