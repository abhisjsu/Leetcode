package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.ListNode;

public class AddLinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode dummy = result;
        int carry = 0;
        int l1val =0;
        int l2val =0;

        while(l1!=null || l2!=null)
        {
            l1val =0;
            l2val =0;

            if(l1!=null)
            {
                l1val = l1.val;
                l1 = l1.next;
            }

            if(l2!=null)
            {
                l2val = l2.val;
                l2 = l2.next;
            }

            int sum = l1val + l2val + carry;
            if(sum>9)
            {
                sum %=10;
                carry =1;
            }
            else
            {
                carry =0;
            }

            ListNode node = new ListNode(sum);
            result.next = node;
            result = result.next;
        }

        if(carry ==1)
        {
            ListNode node = new ListNode(1);
            result.next = node;
        }


        return dummy.next;

    }
}
