package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.LinkedList;
import com.interview.leetcode.datastructure.ListNode;

public class PalindromeLinkedList_Prob234 {

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next==null)
            return true;

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp =null;

        while(fast.next!=null)
        {
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                temp = slow;
                slow = slow.next;
                if(fast == null)
                    break;
            }
            else
                break;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = slow;
        ListNode prev = null;

        if(fast != null)//odd length
        {
            ptr2 = ptr2.next;
        }

        while(ptr1!=slow)
        {
            ListNode nextptr = ptr1.next;
            ptr1.next = prev;
            prev = ptr1;
            ptr1 = nextptr;
        }


        ListNode temp2 = prev;


        while(true)
        {
            // System.out.println(temp2.val+" , "+ptr2.val);
            if(temp2==null && ptr2==null)
                return true;
            else if(temp2.val != ptr2.val)
                return false;
            else if(temp2.next ==null && ptr2.next == null)
            {
                if(temp2.val == ptr2.val)
                    return true;
            }

            temp2 = temp2.next;
            ptr2 = ptr2.next;
        }
    }

    public static void main(String argv[])
    {

        int input[][] = {{10,23,45,23,10},{10,2,45,45,21,10},{10,23,45,45,23,10},
                {10,23,45,23,1}};

        for(int[] current : input)
        {
            LinkedList list = new LinkedList();
            ListNode startList = list.createList(current);

            PalindromeLinkedList_Prob234 p = new PalindromeLinkedList_Prob234();
            System.out.println("Is Palindome : "+p.isPalindrome(startList));
        }

    }
}
