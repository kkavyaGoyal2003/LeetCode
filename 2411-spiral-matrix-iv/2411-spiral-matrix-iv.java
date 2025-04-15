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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] grid = new int[m][n];
        int top = 0, bottom = m-1, left = 0, right = n-1;
        ListNode temp = head;

        while(top < bottom+1 && left < right+1) {
            for(int i = left; i < right+1; i++) {
                if(temp != null ) {
                    grid[top][i] = temp.val;
                    temp = temp.next;
                } else {
                    grid[top][i] = -1;
                }
                
            }
            top++;

            for(int i = top; i < bottom+1; i++) {
                if(temp != null ) {
                    grid[i][right] = temp.val;
                    temp = temp.next;
                } else {
                    grid[i][right] = -1;
                }
            }
            right--;

            if(top < bottom+1) {
                for(int i = right; i >= left; i--) {
                    if(temp != null ) {
                        grid[bottom][i] = temp.val;
                        temp = temp.next;
                    } else {
                        grid[bottom][i] = -1;
                    }
                }
                bottom--;
            }

            if(left < right+1) {
                for(int i = bottom; i >= top; i--) {
                    if(temp != null ) {
                        grid[i][left] = temp.val;
                        temp = temp.next;
                    } else {
                        grid[i][left] = -1;
                    }
                }
                left++;
            }
        }

        return grid;
    }
}