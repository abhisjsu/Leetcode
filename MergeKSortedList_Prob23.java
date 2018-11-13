package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList_Prob23 {

    class ComparableListNode extends ListNode implements Comparable<ComparableListNode>
    {
        public ComparableListNode(int x) {
            super(x);
        }

        public ComparableListNode(ListNode node)
        {
            super(node.val);
            this.next = node.next;
        }

        @Override
        public int compareTo(ComparableListNode o) {
            return this.val - o.val;
        }
    }


    public ListNode mergeKLists(ListNode[] lists) {

        if(lists ==null || lists.length ==0)
            return null;

        ListNode result = new ListNode(0);
        ListNode dummy = result;
        int size = lists.length;

        ComparableListNode list2[] = new ComparableListNode[size];

        PriorityQueue<ComparableListNode> priorityQueue = new PriorityQueue<>(lists.length);

        for(ListNode list: lists)
        {
            if(list != null)
                priorityQueue.add(new ComparableListNode(list));
        }

        while (!priorityQueue.isEmpty())
        {
            result.next = priorityQueue.poll();
            result = result.next;

            if(result.next!=null)
            {
                priorityQueue.add(new ComparableListNode(result.next));
            }
        }


        return dummy.next;
    }

    class ListNodeComparator implements Comparator<ListNode>
    {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public ListNode mergeKLists2(ListNode[] lists) {

        if(lists ==null || lists.length ==0)
            return null;

        ListNode result = new ListNode(0);
        ListNode dummy = result;

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, new ListNodeComparator());

        for(ListNode list: lists)
        {
            if(list != null)
                priorityQueue.add(list);
        }

        while (!priorityQueue.isEmpty())
        {
            result.next = priorityQueue.poll();
            result = result.next;

            if(result.next!=null)
            {
                priorityQueue.add(result.next);
            }
        }


        return dummy.next;
    }


}
