package com.jshen;

import java.util.HashSet;
import java.util.Set;

public class ListCycleReview {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //version 1 with extra space; speed O(n), space O(n)
//    public boolean hasCycle(ListNode head) {
//        Set<ListNode> visited = new HashSet<ListNode>();
//        while(head != null){
//            if(visited.contains(head)){
//                return true;
//            } else {
//                visited.add(head);
//                head = head.next;
//            }
//        }
//        return false;
//    }

    //version 2 without extra space;
    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head; //we assign both slow and fast as head to avoid null exception. for list shorter than 2, we might get this error

        while(fastPointer != null && fastPointer.next != null){
            //these conditions are checking which position the fastpointer is located.
            //if sit at second last at previous loop, fastpointer = fastpointer.next.next will bring fastpointer to be null
            //if sit at third last at previous loop, fastpointer = fastpointer.next.next will bring fastpointer to be the last node, and inside the condition fastpointer.next will be null
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer){
                return true;
            }
        }
        return false;
    }

}
