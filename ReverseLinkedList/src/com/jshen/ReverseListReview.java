package com.jshen;

import java.util.Stack;

public class ReverseListReview {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //using stack, brute force
//    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> storage = new Stack<>();
//        while(head != null){
//            storage.push(head);
//            head = head.next;
//        } // pushing all Node into stack.
//
//        ListNode newHead = new ListNode(0);
//        ListNode pointer = newHead;
//        while(storage.empty() == false){
//            ListNode tem = storage.pop();
//            tem.next = null; //simply push and pop node from stack won't destroy the original link. so wee need tem.next = null to destroy the original link and then set pointer.next = tem, if we forget this step, the final link will has cycle
//            pointer.next = tem;
//            pointer = pointer.next;
//        }
//        return newHead.next;
//    }

    //method 2, directly change directions
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode previous = null;
        ListNode current = head; //we could directly use head, this step is for naming convenience in the while loop

        while(current != null){
            ListNode nextNode = current.next; //save the next node first
            current.next = previous; //change the direction at the LEFT SIDE of current node. **(We don't change the direction at right side at each loop)**
            previous = current; //move the pointer forward
            current = nextNode; //move the pointer forward
        }
        return previous;
    }
}
