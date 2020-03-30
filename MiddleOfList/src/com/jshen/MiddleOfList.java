package com.jshen;

public class MiddleOfList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //note, if length of list is even, we have 2 middle point
    //while(fast != null && fast.next != null) this will bring slow on the 2nd middle Node
    //while(fast.next != null && fast.next.next != null) this will bring slow on the 1st middle Node
}
