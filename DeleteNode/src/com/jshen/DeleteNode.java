package com.jshen;

public class DeleteNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        //we only have a node as parameter, so we are not able to iterate the all linked list
        //so we could only modify the val and then set the last node as null
        while(node.next != null) {
            node.val = node.next.val;
            if(node.next.next == null){ //when we travel to the 2nd last node, node.next.next is null. since we already took the val from the last node to the 2nd last. so we don't need to keep the last node
                node.next = null;
            } else {
                node = node.next;
            }
        }
    }
}
