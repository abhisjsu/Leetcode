/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode first = l1;
        ListNode second = l2;

        ListNode dummy = new ListNode(0);
        ListNode third = dummy;

        ListNode finalList;

        while(first!=null && second!=null)
        {
            if(first.val <=second.val)
            {
                third.next = first;
                first = first.next;
            }
            else
            {
                third.next = second;
                second = second.next;
            }

           third = third.next;
        }

        while(first!=null)
        {
            third.next = first;
            first = first.next;
            third = third.next;
        }

        while(second!=null)
        {
            third.next = second;
            second= second.next;
            third = third.next;
        }

        return dummy.next;

    }
}
