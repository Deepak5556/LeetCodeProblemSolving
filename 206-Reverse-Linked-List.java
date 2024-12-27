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
    public ListNode reverseList(ListNode head) {
       if (head == null) return null;
        Stack<Integer> stk = new Stack<>();
        ListNode ptr = head;
        while (ptr != null) {
            stk.push(ptr.val);
            ptr = ptr.next;
        }
        ListNode newHead = new ListNode(stk.pop());
        ListNode current = newHead;
        while (!stk.isEmpty()) {
            current.next = new ListNode(stk.pop());
            current = current.next;
        }
        return newHead;
    }
}