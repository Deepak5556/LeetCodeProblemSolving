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
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        int arr[] = new int[count];
        cur = head;
        for (int i = 0; i < count; i++) {
            arr[i] = cur.val;
            cur = cur.next;
        }
        String str = convert(arr);
        return Integer.parseInt(str,2);
    }

    public static String convert(int[] arr) {
        StringBuffer str = new StringBuffer();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
        return str.toString();
    }
}