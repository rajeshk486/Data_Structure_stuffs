package com.parkinglot.design.ProblemSolving;

public class MergeBinaryTree {
    public static void main(String []args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(5);
       inorderTraversal(tree.root);
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(2);
        tree1.root.left = new Node(1);
        tree1.root.right = new Node(3);
        //tree1.root.left.left = new Node(3);
        tree1.root.left.right = new Node(4);
        //tree1.root.right.left = new Node(4);
        tree1.root.right.right = new Node(7);
        System.out.println();
        inorderTraversal(tree1.root);
        System.out.println();
        inorderTraversal(mergeBinaryTree(tree1.root,tree.root));
    }
    public static void inorderTraversal(Node root)
    {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.key+" ");
        inorderTraversal(root.right);

    }
    public static Node mergeBinaryTree(Node t1,Node t2)
    {
        if(t1==null && t2==null)
            return null;
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;
        Node n= new Node(t1.key+ t2.key);
        n.right= mergeBinaryTree(t1.right,t2.right);
        n.left = mergeBinaryTree(t1.left,t2.left);
        return n;
    }
}
