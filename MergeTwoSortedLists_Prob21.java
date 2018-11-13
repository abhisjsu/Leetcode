package com.interview.leetcode.september;

/*
21. Merge Two Sorted Lists
DescriptionHintsSubmissionsDiscussSolution
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing
together the nodes of the first two lists.

Example:
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/

import com.interview.leetcode.datastructure.ListNode;

public class MergeTwoSortedLists_Prob21 {

    public ListNode mergeTwoListsSolution1(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1!=null || l2!=null)
        {
            ListNode newnode = new ListNode(0);

            if(l1!=null && l2!=null)
            {
                if(l1.val <l2.val)
                {
                    newnode.val = l1.val;
                    l1 = l1.next;
                }
                else
                {
                    newnode.val = l2.val;
                    l2 = l2.next;
                }
            }
            else if(l1!=null)
            {
                newnode.val = l1.val;
                l1 = l1.next;
            }
            else
            {
                newnode.val = l2.val;
                l2 = l2.next;
            }

            curr.next = newnode;
            curr = curr.next;
        }

        return dummy.next;

    }

    public ListNode mergeTwoListsSolution2(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1!=null || l2!=null)
        {
            ListNode newnode = new ListNode(0);

            if(l1!=null && l2!=null)
            {
                if(l1.val <l2.val)
                {
                    newnode.val = l1.val;
                    l1 = l1.next;
                }
                else
                {
                    newnode.val = l2.val;
                    l2 = l2.next;
                }
            }
            else if(l1!=null)
            {
                while(l1!=null)
                {
                    newnode = new ListNode(0);
                    newnode.val = l1.val;
                    l1 = l1.next;
                    curr.next = newnode;
                    curr = curr.next;
                }
                break;

            }
            else
            {
                while(l2!=null)
                {
                    newnode = new ListNode(0);
                    newnode.val = l2.val;
                    l2 = l2.next;
                    curr.next = newnode;
                    curr = curr.next;
                }
                break;
            }

            curr.next = newnode;
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String argv[])
    {
        ListNode first =null;
        ListNode second =null;
        MergeTwoSortedLists_Prob21 merge = new MergeTwoSortedLists_Prob21();

        merge.mergeTwoListsSolution1(first,second);
        merge.mergeTwoListsSolution2(first,second);

    }


}
