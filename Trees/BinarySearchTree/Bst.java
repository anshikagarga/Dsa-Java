package Trees.BinarySearchTree;

public class Bst {
    static class Node {

        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root , int val){
        if(root == null){
            return false;
        }
        if(root.data ==  val){
            return true;
        }
       if(root.data > val){
           return search(root.left, val);
       }
       else{
           return search(root.right, val);
       }

    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        if(search(root, 1) ){
            System.out.println("Found at "+ root.data);
        }else{
            System.out.println("Not found");
        }

    }
}
