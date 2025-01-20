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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        if(head.next == null) {
            return new int[] {0};
        }
        ListNode temp = head;
        
        while(temp != null){
            ListNode next = temp.next;
            while(next != null){
                if(next.val > temp.val) {
                    list.add(next.val);
                    break;
                }
                next = next.next;
            }
            if(next == null) {
                list.add(0);
            }
            temp = temp.next;
        }
        int [] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}