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

//    version 2, faster one. two pointers method;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        int counterA = 0;
        int counterB = 0;

        while(pointerA != pointerB && counterA < 2 && counterB < 2){
            if(pointerA == null){
                pointerA = headB;
                counterA++;
            } else {
                pointerA = pointerA.next;
            }

            if(pointerB == null){
                pointerB = headA;
                counterB++;
            } else {
                pointerB = pointerB.next;
            }
        }

        if(pointerA == pointerB){
            return pointerA;
        } else {
            return null;
        }
    }
//note for two pointer method
//two lists have different length, key point, they have different length before the common portion(if they actually have intersection)
//so, after pointerA went through listA, we restart it from the head of listB
//identically, after pointerB went through listB, we restart it from the head of listA
//so thing about the portion before the intersection, in term of their length, a + b = b + a
//therefore, the key point is after the first iteration, both pointer will meet each other exactly at the intersection point.
//another key thing
//if those two lists do not have intersection, the above method will go forever
//that's why I set two counters there, if both pointers travel both lists more than twice, and still not meet each other, that means lists don't have intersection
}
