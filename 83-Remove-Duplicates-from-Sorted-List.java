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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode Cur=head;

        while(Cur!=null && Cur.next!=null)
        {
            if(Cur.val == Cur.next.val)
            {
                Cur.next=Cur.next.next;
            }
            else{
                Cur=Cur.next;
            }
        }
        return head;
        
    }
}