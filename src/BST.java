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
        System.out.println("Inserting Item "+key+"\n");
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

    boolean search(Node3 root, int key){
        if(root == null){
            System.out.println("\n"+key+" not found");
            return false;
        }
        if(key == root.item){
            System.out.println("\n"+"found "+root.item);
            return true;
        }
        if(key < root.item){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }

    }
    void delete(int key){
        if(search(root,key)==true){
            root = deleteRec(root, key);
            System.out.println("Item deleted "+key);
        }
        else{
            System.out.println("Not present in the Tree");
        }
    }

    Node3 deleteRec(Node3 root, int key){
        if(root == null){
            return root;
        }
        if(key < root.item){
            root.left = deleteRec(root.left,key);
        }

        else if(key > root.item){
            root.right = deleteRec(root.right,key);
        }
        else{
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            root.item = minvalue(root.right);

            root.right = deleteRec(root.right, root.item);
        }
        return root;
    }

    int minvalue(Node3 root){
        int minv = root.item;
        while(root.left!=null){
            minv = root.left.item;
            root = root.left;
        }
        return minv;
    }

}
