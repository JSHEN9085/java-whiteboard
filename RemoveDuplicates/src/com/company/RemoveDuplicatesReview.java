package com.company;

public class RemoveDuplicatesReview {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode starting = head;

        while(starting != null && starting.next != null){
            if(starting.val == starting.next.val){
                starting.next = starting.next.next;
            } else {
                starting = starting.next;
            }
        }
        return head;
    }
}
