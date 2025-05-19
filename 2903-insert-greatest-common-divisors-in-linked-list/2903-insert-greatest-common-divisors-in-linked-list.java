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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currNode = head;
        ListNode nextNode = head.next;

        while(nextNode != null) {
            ListNode temp = new ListNode(findGCD(currNode.val, nextNode.val));
            currNode.next = temp;
            temp.next = nextNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        
        return head;
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}