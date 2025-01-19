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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode lower = new ListNode(-1);
        ListNode upper = new ListNode(-1);
        ListNode lowerH = lower;
        ListNode upperH = upper;

        ListNode temp = head;

        while(temp != null) {
            if(temp.val < x) {
                lower.next = temp;
                lower = temp;
            } else {
                upper.next = temp;
                upper = temp; 
            }
            temp = temp.next;
        }
        upper.next = null;
        lower.next = upperH.next;

        return lowerH.next;
    }
}