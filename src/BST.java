class Node3 {
    int item;
    Node3 left, right;
    public Node3(int key){
        item = key;
        left = right = null;
    }
}
public class BST {
    Node3 root;
    BST(){
        root = null;
    }
    void insert(int key){
        root = insertKey(root, key);
    }

    Node3 insertKey(Node3 root, int key){
        if(root == null){
            root = new Node3(key);
            return root;
        }
        if(key < root.item){
            root.left = insertKey(root.left,key);
        }
        if(key > root.item){
            root.right = insertKey(root.right,key);
        }
        return root;
    }

    void inorder(){
        inorderRec(root);
    }
    void inorderRec(Node3 root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.item+"-->");
            inorderRec(root.right);
        }
    }

    void search(Node3 root, int key){
        try {
            if(root == null){
                System.out.println("\n"+key+" not found");
            }
            if(key == root.item){
                System.out.println("\n"+"found "+root.item);
            }
            if(key < root.item){
                search(root.left,key);
            }
            if(key > root.item){
                search(root.right,key);
            }
        }
        catch (Exception e){
        }


    }
}
