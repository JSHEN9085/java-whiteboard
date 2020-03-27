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
        ListNode pointer = head;
        while(pointer != null && pointer.next != null){
            if(pointer.val == pointer.next.val){
                pointer.next = pointer.next.next; //we skip the one that has the same val as predecessor's val, but no need to move the pointer
            } else {
                pointer = pointer.next; //we move the pointer forward only if the val is different
            }
        }
        return head; //after we remove all duplicated value, head will be fine with no duplication
    }
}
