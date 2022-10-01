package Tree;

public class TreeTester {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int [] array = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = bst.treeBuilder(array);
        bst.levelOrder(root);
        System.out.println("___________________>");
        System.out.println("Number of nodes :"+bst.countNode(root));
        System.out.println("_________________________>");
        System.out.println();
        bst.inorder(root);
        System.out.println();
        System.out.println("___________________________>");
        bst.preorder(root);
        System.out.println();
        System.out.println("------------------------------>");
        bst.postorder(root);
    }
}
