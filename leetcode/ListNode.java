package com.parkinglot.design.ProblemSolving;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }

    ListNode(int val, ListNode node) {
        this.val = val;
        next = node;
    }
}
