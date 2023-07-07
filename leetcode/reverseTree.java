package com.parkinglot.design.ProblemSolving;

public class reverseTree {
    public static void inorderTraversal(Node root)
    {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.key+" ");
        inorderTraversal(root.right);
    }
    static void reverse(Node root)
    {
        if(root == null)
            return;
        Node temp= root.left;
        root.left=root.right;
        root.right= temp;
        reverse(root.right);
        reverse(root.left);
    }
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        inorderTraversal(tree.root);
        reverse(tree.root);
        System.out.println();
        inorderTraversal(tree.root);
    }
}
