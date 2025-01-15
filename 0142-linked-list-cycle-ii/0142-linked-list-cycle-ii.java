/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode node = null;
        if(head == null || head.next == null) {
            return node ;
        }
        int pos = 0;
        ListNode temp = head;
        HashMap<ListNode, Integer> map = new HashMap<>();

        while(temp != null) {
            if(map.containsKey(temp)) {
                return temp;
            }
            map.put(temp , pos);
            pos++;
            temp = temp.next;
        }
        return node;
    }
}