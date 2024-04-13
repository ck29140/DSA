import java.util.Queue;

public class DSA {
    public static void main(String[] args) {
        FullBinaryTree tree = new FullBinaryTree();
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
        }
    }
}
