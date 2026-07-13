package Trees;
import java.util.*;

public class heightOfTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int count(Node root){
        if(root ==  null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        int count = leftCount + rightCount + 1;
        return count;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDiam = diameter2(root.left);
        int rightDiam = diameter2(root.right);
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiam = leftHeight + rightHeight +1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    public static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static  Info diameter(Node root){
          if(root == null){
              return new Info(0,0);
          }
          Info leftHeight = diameter(root.left);
          Info rightHeight = diameter(root.right);
          int diam = Math.max(Math.max(leftHeight.diam, rightHeight.diam), leftHeight.ht + rightHeight.ht + 1);
          int ht = Math.max(leftHeight.ht, rightHeight.ht) + 1;

          return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//        System.out.println(height(root));
//        System.out.print(sum(root));
        System.out.println(diameter(root).diam);
    }
}
