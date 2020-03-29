package com.jshen;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListsIntersection {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

//  version 1, brute force
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> visited = new HashSet<>();
//        while(headA != null){
//            visited.add(headA);
//            headA = headA.next;
//        }
//
//        while(headB != null){
//            if(visited.contains(headB)){
//                return headB;
//            }
//            headB = headB.next;
//        }
//        return null;
//    }

//    version 2, faster one;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    }
}
