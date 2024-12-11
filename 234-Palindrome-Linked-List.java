/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre = null;
        ListNode curr = slow.next;
        ListNode next = null;

        while(curr!= null)
        {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        ListNode Firsthalf = head;
        ListNode Secondhalf = pre;
        while(Secondhalf!=null)
        {
            if(Firsthalf.val  != Secondhalf.val)
            {
                return false;
            }   

            Firsthalf = Firsthalf.next;
            Secondhalf = Secondhalf.next;   
         }
         return true;
    }
}