package com.parkinglot.design.ProblemSolving;

public class reverseLinkedList {
    public static void main(String args[])
    {
        ListNode head= new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        listTraversal(head);
        reverseList(head);
    }

    private static void reverseList(ListNode head) {
        ListNode prev= null;
        ListNode current= head;
        ListNode next= null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        ListNode node = prev;
        listTraversal(node);
    }

    private static void listTraversal(ListNode head) {
        while(head!=null)
        {
            System.out.print(head.val+" ");
             head= head.next;
        }
        System.out.println();
    }
}
