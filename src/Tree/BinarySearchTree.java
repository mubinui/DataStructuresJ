package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    int idx = -1;
    public Node treeBuilder(int [] nodes){
        idx++;
        if (nodes[idx]==-1) return null;
        Node root = new Node(nodes[idx]);
        root.left = treeBuilder(nodes);
        root.right = treeBuilder(nodes);
        return root;
    }

    // tree traversal methods [BFS]
    public void levelOrder(Node root){
        if (root==null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // for printing the level
        while (!queue.isEmpty()){
            Node current =  queue.remove(); // helping to iterate
            if (current==null){
                System.out.println(); // printing a new line as level
                if (queue.isEmpty()) break;
                else queue.add(null); //
            }
            else {
                System.out.print(current.data+" ");
                if (current.left!=null) queue.add(current.left);
                if (current.right!=null) queue.add(current.right);
            }

        }
    }
}
