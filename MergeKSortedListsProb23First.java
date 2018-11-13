/**

Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKSortedListsProb23First {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode first = l1;
        ListNode second = l2;

        ListNode dummy = new ListNode(0);
        ListNode third = dummy;

        while(true)
        {
            if(first!=null && second!=null)
            {
                if(first.val<second.val)
                {
                    third.next = first;
                    first = first.next;
                }
                else
                {
                    third.next = second;
                    second = second.next;
                }
            }
            else
            {
                if(first!=null)
                {
                    third.next = first;
                    first = first.next;
                }
                else if(second!=null)
                {
                    third.next = second;
                    second = second.next;
                }
            }

            third = third.next;

            if(first==null && second==null)
                break;
        }

        return dummy.next;

    }

    public ListNode mergeKLists(ListNode[] lists) {

        int listSize = lists.length;

        if(listSize == 0)
            return null;

        if(listSize == 1)
            return lists[0];


        ListNode result = mergeTwoLists(lists[0],lists[1]);

        for(int i =2;i<listSize;i++)
        {
            result = mergeTwoLists(result,lists[i]);
        }

        return result;

    }
}
