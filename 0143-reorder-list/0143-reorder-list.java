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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return ;
        }
        ListNode mid = midNode(head);
        ListNode second = reverse(mid.next);
        mid.next = null;

        reorderLinkedList(head, second);
    }
    public ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode slow) {
        ListNode prev = null;
        ListNode temp = slow;

        while(temp != null) {
            ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;
        }

        return prev;
    }

    public void reorderLinkedList(ListNode head, ListNode mid) {
        ListNode first = head;
        ListNode second = mid;

        while(second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }

}