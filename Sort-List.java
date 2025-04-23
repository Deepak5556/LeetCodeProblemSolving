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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        List<Integer> values = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            values.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(values);
        cur = head;
        for (int i : values) {
            cur.val = i;
            cur = cur.next;
        }
        return head;
    }
}