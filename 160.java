

/**

Write a program to find the node at which the intersection of two singly linked lists begins.


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 *

First Submission: 15.88%

1. Find the length of both lists
2. Take difference in lengths
3. Move the start of longer list by size difference
4. Start moving pointers one by one till last is encountered

 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB==null)
            return null;

        ListNode first = headA;
        ListNode second = headB;

        int firstLength = 0;
        int secondLength = 0;


        while(true)
        {
            if(first!=null)
            {
                firstLength++;
                first=first.next;
            }

            if(second!=null)
            {
                secondLength++;
                second = second.next;
            }

            if(first == null && second==null)
                break;
        }

        first = headA;
        second = headB;

        int diff = Math.abs(firstLength - secondLength);

        System.out.println(firstLength+" , "+secondLength);

        if(firstLength>secondLength)
        {
            do
            {
                first = first.next;
                diff--;
            }while(diff>0);
        }
        else if(firstLength<secondLength)
        {
            do
            {
                second = second.next;
                diff--;
            }while(diff>0);

        }

        System.out.println(second.val);

        int endpoint = firstLength>secondLength?secondLength:firstLength;

        for(int i = 1;i<=endpoint;i++)
        {
            if(first.val == second.val)
                return first;

            first = first.next;
            second = second.next;
        }

        return null;
    }
}
