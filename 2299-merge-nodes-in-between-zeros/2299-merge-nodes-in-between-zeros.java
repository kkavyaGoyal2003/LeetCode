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
    public ListNode mergeNodes(ListNode head) {
        ListNode currZero = head;
        ListNode nextZero = head.next;
        ListNode dummy = new ListNode(-1);
        ListNode newHead =  dummy;

        int sum = 0;
        while(nextZero != null) {
            if(nextZero.val == 0) {
                ListNode temp = new ListNode(sum);
                dummy.next = temp;
                dummy = temp;
                currZero = nextZero;
                sum = 0;
            } else {
                sum += nextZero.val;
            }
            nextZero = nextZero.next;
        }

        return newHead.next;
    }
}