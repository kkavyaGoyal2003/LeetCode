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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);

        ListNode newHead = new ListNode(list.get(0));
        temp = newHead;
        for(int i = 1; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            temp.next = node;
            temp = node;
        }

        return newHead;
    }
}