package GsQuestions.Mirror;

import java.util.ArrayDeque;

public class Node {
    int data;
    Node right,left;
    Node(int data){
        this.data=data;
    }
}

class MirrorRepr{
    public static void mirror(Node root){
        if(root==null) return;

        ArrayDeque<Node> q=new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            Node node=q.remove();

            Node temp=node.left;
            node.left=node.right;
            node.right=temp;

            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
    }
    public static void printInOrder(Node root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Inorder Before Mirroring:");
        printInOrder(root);

        mirror(root);

        System.out.println("\nInorder After Mirroring:");
        printInOrder(root);
    }
}
