package com.jshen;

public class RemoveElements {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode pointer = new ListNode(-1); //create a fake head before the real head
        pointer.next = head; //linked the fake head to the rest of the list
        head = pointer;   // we move the read head one position before the real head, so at the end we could return head.next to present the final answer

        while(pointer.next != null){  //if we consider the while loop only, this while loop starts checking from the 2nd position, if the 1st node of the list has the target val, we will miss that. that's why we need to made a fake head before the real head
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return head.next;
    }
}
