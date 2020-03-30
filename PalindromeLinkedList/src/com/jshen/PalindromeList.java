package com.jshen;

import java.util.Stack;

public class PalindromeList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    //method 1 brute force, use stack
//    public boolean isPalindrome(ListNode head) {
//        Stack<ListNode> storage = new Stack<>();
//        ListNode pointer = head;
//
//        while(pointer != null){
//            storage.push(pointer);
//            pointer = pointer.next;
//        }
//
//        while(storage.empty() == false){
//            if(head.val != storage.pop().val){
//                return false;
//            }
//            head = head.next;
//        }
//        return true;
//    }

    //two pointer method
    public boolean isPalindrome(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        //use fast and slow pointer to run through the list, when the loop stops, slow pointer will be at the middle of the list

        ListNode previous = null;
        ListNode current = slowPointer;
        while(current != null){
            ListNode nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        //right here I reverse the 2nd half of the list, from slow pointer(middle point) to the end
        //1 > 2 > 3 > 2 > 1 changed to 1 > 2 > 3 < 2 < 1, head is still at 1 at left, previous is at 1 at right

        while(previous != null){
            if(head.val != previous.val){
                return false;
            }
            head = head.next;
            previous = previous.next;
            //iterate head from left and previous from right, if val is different return false.
        }
        return true;
    }
}
