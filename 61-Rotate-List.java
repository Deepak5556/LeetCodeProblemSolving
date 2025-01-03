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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 )
        {
            return head;
        }
        ListNode cur=head;
        int n = 1;
        while(cur.next!=null){
            cur = cur.next;
            n++;
        }
        cur.next = head;
        int nhead = n-(k%n);
        for(int i=0;i<nhead;i++)
        {
            cur = cur.next;
        }
        ListNode newhead = cur.next;
        cur.next= null;
        return newhead;   
    }
}