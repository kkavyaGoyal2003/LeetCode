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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while(temp1 != null  && temp2 != null) {
            if(temp1.val < temp2.val) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }
        while(temp1 != null) {
            tail.next = temp1;
            tail = temp1;
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            tail.next = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }

        head = head.next;

        return head;
    }
}