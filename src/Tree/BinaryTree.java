package Tree;

public class BinaryTree {
    // root of the binary tree
    Node root;
    //Constructors
    public BinaryTree(int key){
        root = new Node(key);

    }
    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        int array [] = {1, 2, 3, 4,9, 10, 11, 12, 13};
        BinaryTree bt =new BinaryTree();
        bt.root = new Node(array[0]);
        Node root = bt.root;
        Node temp_root = root;
        Node temp_right_root = root;

        // Creating branches
        for (int i = 0; i <array.length/2 ; i++) {
            if(i%2==0){
                temp_root.left = new Node(array[2*i+1]);
                temp_root.right = new Node(array[2*i+2]);
                temp_root = temp_root.left;

            }
            else{
                temp_root.left = new Node(array[2*i+1]);
                temp_root.right = new Node(array[2*i+2]);
                temp_root = temp_root.right;


            }

            
        }

    }
    public void branch_creator(Node root, int li, int ri){
        root.left = new Node(li);
        root.right = new Node(ri);

    }



}
