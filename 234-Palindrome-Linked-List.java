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
        ListNode Fast=head;
        ListNode Slow=head;
        while(Fast != null && Fast.next != null)
        {
            Slow=Slow.next;
            Fast=Fast.next.next;
        }
        ListNode firsthalf = head;
        ListNode secondhalf = Slow;
        Stack<Integer> stk = new Stack<>();
        ListNode ptr = secondhalf;
        while (ptr != null) {
            stk.push(ptr.val);
            ptr = ptr.next;
        }
        ListNode temp = new ListNode(stk.pop());
        ListNode current = temp;
        while (!stk.isEmpty()) {
            current.next = new ListNode(stk.pop());
            current = current.next;
        }

        ListNode sec=temp;

        while(sec!=null)
        {
            if(firsthalf.val!=sec.val)return false;
            firsthalf=firsthalf.next;
            sec=sec.next;
        }
        return true;
    }
}