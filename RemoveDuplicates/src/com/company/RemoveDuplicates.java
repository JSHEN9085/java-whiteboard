package com.company;

//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//Example 1:
//Input: 1->1->2
//Output: 1->2
//
//Example 2:
//Input: 1->1->2->3->3
//Output: 1->2->3

public class RemoveDuplicates {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode deleteDuplicates(ListNode head) {
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
