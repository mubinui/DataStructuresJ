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
    // height is the deepest path between the root and the leaves
    public int countHeight(Node root){
        if (root==null) return 0;
        int leftHeight = countHeight(root.left); // height of the left subtree.
        int rightHeight = countHeight(root.right); // height of the right subtree
        return Math.max(leftHeight,rightHeight)+1; // the +1 is for the root node

    }
    // Diameter of a tree .
     // Number of Nodes in the longest path between any two nodes
    // case 01 : Diameter through root
    // Case 02 : Diameter not through root
    public int diameterA01 (Node root ){
        // 1. diameter in left subtree
        // 2. diameter in right subtree
        // 3. diameter in left_height+right_height+1
        // max of these three will be the diameter of our actual tree
        if (root == null ) return 0;
        int leftSubDiam = diameterA01(root.left);
        int rightSubDiam = diameterA01(root.right);
        int height = countHeight(root.left)+countHeight(root.right);
        return Math.max(Math.max(leftSubDiam,rightSubDiam),height+1);

    }
    public class TreeInfo{
        int height;
        int diam;

        TreeInfo(int height, int diam){
            this.height = height;
            this.diam = diam;

        }

    }
    // calculating diameter and height together
    public TreeInfo optimized_diameter(Node root){
        if (root == null) return new TreeInfo(0,0);
        // Tree info
        //Calculating height
        TreeInfo left = optimized_diameter(root.left);
        TreeInfo right = optimized_diameter(root.right);
        int treeHeight = Math.max(left.height, right.height)+1;
        // determining the diameter of a tree
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1;
        int outDiam = Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo output = new TreeInfo(treeHeight,outDiam);
        return output;

    }

}
