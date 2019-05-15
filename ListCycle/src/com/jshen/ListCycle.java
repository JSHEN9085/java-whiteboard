package com.jshen;

//Given a linked list, determine if it has a cycle in it.
//Example 1:
//Input: head = [3,2,0,-4], pos = 1
//Output: true
//Explanation: There is a cycle in the linked list, where tail connects to the second node.

public class ListCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}

//hint: We set two pointers fast and slow.
//fast moves 2 steps at a time, while slow moves one step a time as below,
//If there is no cycle in the List, the fast pointer reaches the tail at O(n/2) time.
//If the List is circular, the slow pointer moves through the whole List and eventually equals to the fast pointer