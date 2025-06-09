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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null) {
            fast = reverse(slow.next);
        } else {
            fast = reverse(slow);
        }
        slow = head;
        return checkPalindrome(slow, fast);
    }
    public ListNode reverse(ListNode node) {
        ListNode prev = null;
        while(node != null) {
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        return prev;
    }

    public boolean checkPalindrome(ListNode slow, ListNode fast) {
        while(fast != null) {
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}