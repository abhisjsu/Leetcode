

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
    public ListNode reverseList(ListNode head) {

        if(head==null)
            return head;

        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();

        while(temp!=null)
        {
            stack.push(temp);
            temp  = temp.next;
        }

        ListNode dummy = new ListNode(0);
        temp = dummy;

        while(true)
        {
           if(!stack.empty())
           {
               temp.next = (ListNode)stack.pop();

               if(stack.empty())
               {
                   temp.next.next = null;
                   break;
               }
               temp = temp.next;
           }
        }

        return dummy.next;

    }
}
