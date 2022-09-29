package Tree;

public class TreeTester {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int [] array = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = bst.treeBuilder(array);
        bst.levelOrder(root);
    }
}
