package com.jshen;

public class ConvertBinary {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public int getDecimalValue(ListNode head) {
        ListNode previous = null;
        while(head != null){
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }

        int power = 0;
        int result = 0;
        while(previous != null){
            result += previous.val * Math.pow(2, power);
            power++;
            previous = previous.next;
        }
        return result;
    }
//note: convert from binary to decimal
//example    1  < 0  < 1  < 0  < 1, for this binary we need to start from right hand side, so we need to reverse the linked list first
//          2^4  2^3  2^2  2^1  2^0
//the final result is (2^4 x 1) + (2^3 x 0) + (2^2 x 1) + (2^1 x 0) + (2^0 x 0) = 21;
//if we could start from right side, we don't need to know the length of the link, we just keep adding the power as power++ for each loop
}
