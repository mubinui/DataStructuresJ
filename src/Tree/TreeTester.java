package Tree;

public class TreeTester {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int [] array = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};
        int [] tree = {1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, -1, 10, -1, -1, 7, -1, -1};
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
        System.out.println();
        System.out.println("The height of the tree "+ bst.countHeight(root));
        System.out.println("------------------------------------------------>");
        System.out.println("____________Tree test 02___________________");
        BinarySearchTree binary_tree = new BinarySearchTree();
        Node b_root = binary_tree.treeBuilder(tree);
        System.out.println("Diameter of the tree "+binary_tree.diameterA01(b_root));
        System.out.println("Diameter of the tree using "+binary_tree.optimized_diameter(b_root).diam);

    }
}
