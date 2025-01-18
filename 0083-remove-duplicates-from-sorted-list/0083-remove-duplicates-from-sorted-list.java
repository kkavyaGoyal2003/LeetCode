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
        ListNode nextnode = temp.next;

        while(temp != null) {
            if(temp.val == nextnode.val) {
                temp.next = nextnode.next;
                if(nextnode.next == null) break;
                nextnode = nextnode.next;
            } else {
                temp = temp.next;
                if(nextnode.next == null) break;
                nextnode = nextnode.next;
            }
        }

        return head;
    }
}