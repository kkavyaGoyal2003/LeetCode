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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode temp = head;
        ListNode tail = head;
        int size = 0;
        while(temp != null) {
            size++;
            tail = temp;
            temp = temp.next;
        }
        k = k % size;
        if(k == 0) return head;
        int i = size - k;
        int count = 1;
        ListNode node = head;
        while(count < i) {
            node = node.next;
            count++;
        }
        tail.next = head;
        head = node.next;
        node.next = null;

        return head;
    }
}