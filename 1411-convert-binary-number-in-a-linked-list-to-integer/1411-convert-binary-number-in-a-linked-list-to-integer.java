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
        head = reverse(head);
        ListNode temp = head;
        int num = 0;
        int prd = 1;
        while(temp != null) {
            if(temp.val == 1) {
                num = num + (prd);
            } 
            prd *= 2;
            temp = temp.next;
        }
        return num;
    }
    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
        }

        return prev;
    }

}