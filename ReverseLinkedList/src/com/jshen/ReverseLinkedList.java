package com.jshen;

//Reverse a singly linked list.
//Example:
//Input: 1->2->3->4->5->NULL
//Output: 5->4->3->2->1->NULL

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x){ val = x; }
    }

    //iterative;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current.next; //save the next node into variable next,


            current.next = prev; //at the first iteration, next node will be null, we assigned prev as null at line 13
            prev = current; //pushing the iteration, in each round prev is the next node of current, so we need to reassign it as current node, so in the next round current.next will point to the right node.

            current = next; //push the iteration into the next step, point current as the next node we saved at line 18
        }
        return prev;
    }

    //recursive
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//
//        ListNode next = head.next;
//        ListNode newHead = reverseList(next);
//        next.next = head;
//        head.next = null;
//        return newHead;
//    }
}
