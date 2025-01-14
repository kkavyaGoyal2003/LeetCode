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
    public int pairSum(ListNode head) {
        if(head == null || head.next.next == null) {
            return head.val + head.next.val;
        }

        return twinSum(head);
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

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while(temp != null) {
            ListNode node = temp.next;
            temp.next = prev;
            prev = temp;
            temp = node;   
        }
        return prev;
    }

    public int twinSum(ListNode head) {
        ListNode  first = head;
        ListNode second = reverse(midNode(head));
        int max = 0;
        while(second != null) {
            int sum = first.val + second.val;
            max = Math.max(max, sum);
            first = first.next;
            second = second.next;
        }
        return max;
    }
}