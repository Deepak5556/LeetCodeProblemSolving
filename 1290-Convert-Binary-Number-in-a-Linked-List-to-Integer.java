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
        String t;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }        
        int[] arr = new int[count];
        cur =head;
        for(int i=0;i<count;i++)
        {
            arr[i]= cur.val;
            cur=cur.next;
        }
        t=convert(arr);
        return Integer.parseInt(t,2); 
    }
    public static String convert(int[] arr)
    {
        StringBuffer s = new StringBuffer();
        for(int i : arr){
            s.append(i);
        }
        return s.toString();
        // return Integer.parseInt(s,2);
        // return s;

    }
}