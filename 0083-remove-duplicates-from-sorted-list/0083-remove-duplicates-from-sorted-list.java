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
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode curr = temp.next;

        while(temp != null) {
            if(temp.val == curr.val) {
                temp.next = curr.next;
                if(curr.next == null) break;
                curr = curr.next;
            } else {
                temp = temp.next;
                if(curr.next == null) break;
                curr = curr.next;
            }
        }

        return head;
    }
}