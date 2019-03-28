package com.company;
//Merge two sorted linked lists and return it as a new list.
//The new list should be made by splicing together the nodes of the first two lists.

//Example:
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4

public class MergeLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        //or write it as ListNode head = new ListNode(-1), temp = head;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
            temp.next = null;
        }

        if(l1 != null){
            temp.next = l1;
        }

        if(l2 != null){
            temp.next = l2;
        }
        return head.next;
    }
}
