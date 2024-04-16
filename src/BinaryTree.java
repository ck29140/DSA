class Node {
    int item;
    Node left, right;
    public Node(int key){
        item = key;
        left = right = null;
    }
}

public class BinaryTree{
    Node root;
    BinaryTree(int key){
        root = new Node(key);
    }
    BinaryTree(){
        root = null;
    }

    public void PostOrder(Node node){
        if(node == null){
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.item+" -> ");
    }

    public  void InOrder(Node node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(node.item+" -> ");
        InOrder(node.right);
    }

    public  void PreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.item+" -> ");
        PreOrder(node.left);
        PreOrder(node.right);
    }


}
