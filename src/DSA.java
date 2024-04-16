import java.util.Queue;

public class DSA {
    public static void main(String[] args) {
        /*FullBinaryTree tree = new FullBinaryTree();
        tree.root = new Node2(78);
        tree.root.left = new Node2(12);
        tree.root.right = new Node2(45);
        tree.root.left.left = new Node2(63);
        tree.root.left.right = new Node2(85);
        tree.root.right.left = new Node2(15);
        tree.root.right.right = new Node2(52);

        if(tree.IsFullBinaryTree(tree.root)){
            System.out.println("Tree Full");
        }
        else {
            System.out.println("Tree Empty");
        }*/

        /*BinaryTree tree = new BinaryTree();
        tree.root = new Node(22);
        tree.root.right = new Node(45);
        tree.root.left = new Node(12);
        tree.InOrder(tree.root);
        tree.PreOrder(tree.root);
         */
        BST bst = new BST();
        bst.insert(23);
        bst.insert(13);
        bst.insert(45);
        bst.insert(12);
        bst.inorder();
        bst.search(bst.root,19);
    }
}
