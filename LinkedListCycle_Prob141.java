package com.interview.leetcode.september;

import com.interview.leetcode.datastructure.ListNode;

public class LinkedListCycle_Prob141 {
    public boolean hasCycle(ListNode head) {

        if(head ==null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            fast = fast.next;

            if (fast == null)
                return false;

            if (slow.val == fast.val)
                return true;
            else
            {
                fast = fast.next;
                slow = slow.next;

                if (fast ==null ||slow ==null)
                    return false;
                else if (slow.val == fast.val)
                    return true;
            }
        }

        return false;

    }

    public static void main()
    {
        LinkedListCycle_Prob141 l = new LinkedListCycle_Prob141();
        ListNode start = new ListNode(10);
        l.hasCycle(start);
    }
}
