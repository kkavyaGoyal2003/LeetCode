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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        ListNode temp = head;
        ListNode prev = temp;

        int maxElement = temp.val;

        while(temp != null) {
            if(maxElement > temp.val) {
                prev.next = temp.next;
            } else {
                prev = temp;
                maxElement = temp.val;
            }
            temp = temp.next;
        }
        return reverse(head);
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