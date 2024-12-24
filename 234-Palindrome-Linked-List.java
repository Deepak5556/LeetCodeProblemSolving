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
        if(head==null||head.next==null)return true;

        ListNode fast=head;
        ListNode slow=head;

        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode cur=slow.next;
        ListNode pre=null;
        ListNode next=null;
        while(cur!=null)
        {
           next=cur.next;
           cur.next=pre;
           pre=cur;
           cur= next;
        }
        ListNode FirstHalf=head;
        ListNode SecondHalf=pre;
        
        while(SecondHalf!=null)
        {
            if(FirstHalf.val!=SecondHalf.val)return false;
            FirstHalf=FirstHalf.next;
            SecondHalf=SecondHalf.next;
        }
        return true;
    }
}