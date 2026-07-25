package Trees.BinarySearchTree;

import java.util.ArrayList;

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

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            // case 1 leaf node
            if(root.left == null && root.right == null){
                return null;
            }

//            case 2 single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            // case 3 both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    private static Node findInorderSuccessor(Node root) {
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left , k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i) + " -> ");
            }
        System.out.println("null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size() -1);
    }

    public static boolean isValidBST(Node root, Node min, Node max){
           if(root == null){
               return true;
           }
           if(min != null && root.data <= min.data){
               return false;
           }
            else if(max != null && root.data >= max.data){
            return false;
        }
            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }



    public static void main(String[] args) {
//        int values[] = { 5, 1, 3, 4, 2, 7 };
        int values[] = {8, 5,3,1, 4,6,10, 11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
//        if(search(root, 1) ){
//            System.out.println("Found at "+ root.data);
//        }else{
//            System.out.println("Not found");
//        }

//        System.out.println();
//        root = delete(root, 1);
//        System.out.println();
        inorder(root);
        System.out.println();
//        printInRange(root, 5, 12);
//        printRoot2Leaf(root, new ArrayList<>());
        if(isValidBST(root, null, null)){
            System.out.println("valid BST");
        }else{
            System.out.println("not valid BST");
        }


    }
}
