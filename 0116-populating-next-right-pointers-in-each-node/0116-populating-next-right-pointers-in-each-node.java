/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)return root;
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            Node prevnode = queue.peek();

            for(int i=0;i<size;i++){
                Node currnode = queue.poll();

                if(currnode != prevnode){
                    prevnode.next = currnode;
                    prevnode = currnode;
                }

                if(currnode.left != null)queue.offer(currnode.left);
                if(currnode.right != null)queue.offer(currnode.right);
            }
            prevnode.next = null;
        }

        return root;
    }
}