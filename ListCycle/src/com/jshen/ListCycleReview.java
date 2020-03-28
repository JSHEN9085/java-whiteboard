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
        
    }

}
