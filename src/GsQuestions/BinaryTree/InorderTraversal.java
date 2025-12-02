package GsQuestions.BinaryTree;

public class InorderTraversal {
    // Recursive inorder traversal
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);            // Traverse left subtree
        System.out.print(root.val + " ");  // Visit root
        inorder(root.right);           // Traverse right subtree
    }

    public static void main(String[] args) {
        // Creating a simple binary tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder traversal of the binary tree:");
        inorder(root);
        // Expected output: 4 2 5 1 3
    }

}
