package com.parkinglot.design.ProblemSolving;

public class BinaryTree {
    Node root;
BinaryTree()
{root = null;}
}
class Node {
    int key;
    Node left, right;
    Node(int item)
    {
        key = item;
        left = right = null;
    }
    public static void inorderTraversal(Node root)
    {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.key+" ");
        inorderTraversal(root.right);

    }
}
