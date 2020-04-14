package com.jshen;

public class Add2Nums {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;
        int sum = 0;

        while(l1 != null || l2 != null){
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;

            }
            ListNode next = new ListNode(sum % 10);
            pointer.next = next;
            pointer = pointer.next;
            sum = sum / 10;   // if l1 + l2 > 10, for example, 15. 5 is set as the next node as sum % 10 at line 20, and 10 will remain at sum as 1 after sum /= 10 and pass to the next loop
        }

        if(sum == 1){
            ListNode last = new ListNode(sum);
            pointer.next = last;
        }
        return result.next;
    }
//Note: if iterate l1 and l2, then sum it together, the final sum might be greater than max of int, if assign them as long, that will take a lot of unnecessary space
//therefore, we create new ListNode at the same time we iterate l1 and l2.
}
