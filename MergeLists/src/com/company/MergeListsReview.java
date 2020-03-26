package com.company;

public class MergeListsReview {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){    //determine if any of the list is null
            return null;
        } else if (l1 == null){
            return l2;
        } else if (l2 == null){
            return l1;
        } else {
            ListNode head = new ListNode(-1);
            ListNode pointer = head;
            //for above two steps (line 19 and 20), we need to have a head first,
            //and then a pointer, we can't make head and pointer as one single note
            //because pointer keeps changing to the end, and we need to return head.next to represent the whole list at then end

            while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    pointer.next = l1;
                    l1 = l1.next;
                } else {
                    pointer.next = l2;
                    l2 = l2.next;
                }
                pointer = pointer.next; //keep moving the pointer to the latest note
            }

            if(l1 == null){  // for the situation that l1 and l2 have different length
                pointer.next = l2;
            }
            if(l2 == null){
                pointer.next = l1;
            }
            return head.next; //see the note at line 21
        }
    }
}
