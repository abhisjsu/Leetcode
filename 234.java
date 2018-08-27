/*Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
*/
class Solution {
    Stack<Integer> stack = new Stack<>();

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null)
            return true;
        ListNode temp = head;

        while(temp!=null)
        {
            this.stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;

        while(!stack.empty())
        {
            if(stack.pop()!=temp.val)
                return false;

            temp=temp.next;
        }

            return true;

    }
}
