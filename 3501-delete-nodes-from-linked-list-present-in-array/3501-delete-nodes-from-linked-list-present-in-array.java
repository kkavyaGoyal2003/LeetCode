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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>  set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        ListNode prev = null;
        ListNode temp = head;
        ListNode nextNode = temp.next;
        while(temp != null) {
            nextNode = temp.next;
            if(set.contains(temp.val)) {
                if(temp == head) {
                    head = head.next;
                } else {
                    prev.next = nextNode;
                    temp.next = null;
                }
            } else {
                prev = temp;
            }
            temp = nextNode;
        }
        
        return head;
    }
}