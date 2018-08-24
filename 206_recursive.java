/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }

 Reverse a singly linked list.

 Example:

 Input: 1->2->3->4->5->NULL
 Output: 5->4->3->2->1->NULL

 Solution: Making use of Stack class
 */

import java.util.*;

class Solution {

    public ListNode newhead;

    public ListNode recursiveReverse(ListNode head)
    {
        if(head.next == null)
        {
            this.newhead = head;
            return head;
        }



        ListNode nextnode = recursiveReverse(head.next);
        nextnode.next = head;
        return head;
    }

    public ListNode reverseList(ListNode head) {

        if(head==null)
            return head;

        ListNode lastnode = recursiveReverse(head);
        head.next = null;

        return this.newhead;
    }
}
