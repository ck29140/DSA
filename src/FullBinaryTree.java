
class Node2 {
    int item;
    Node2 left, right;
    public Node2(int key){
        item = key;
        left = right = null;
    }
}


public class FullBinaryTree {
    Node2 root;
    boolean IsFullBinaryTree(Node2 node){
        if(root == null){
            return true;
        }
        if(node.left == null && node.right == null){
            return true;
        }
        if(node.left != null && node.right != null){
            return (IsFullBinaryTree(node.left) && IsFullBinaryTree(node.right));
        }
        return false;
    }
}