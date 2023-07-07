package com.parkinglot.design.ProblemSolving;

public class InvertBinaryTree {
    static boolean isSymmetric(Node root)
    {
        return true;
    }
    public static void inorderTraversal(Node root)
    {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.key+" ");
        inorderTraversal(root.right);

    }
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        boolean output = isSymmetric(tree.root);
        if (output == true)
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");
        inorderTraversal(tree.root);
    }
}
