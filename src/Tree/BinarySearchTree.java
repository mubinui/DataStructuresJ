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
    // tree traversal methods DFS
    // Inorder preorder and postorder
    public void inorder(Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public void preorder(Node root){
        if (root== null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public void postorder(Node root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");

    }

    public int countNode(Node root){
        if (root==null) return 0;
        int left = countNode(root.left);
        int right = countNode(root.right);
        return left + right + 1; // here 1 for root .
        // the recursive method will iterate through the whole tree
        // so even the leaves will be considered as root
    }
//    public int countHeight(Node root){
//        if (root==null) return
//    }

}
