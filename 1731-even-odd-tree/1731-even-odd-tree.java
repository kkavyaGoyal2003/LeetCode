/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        int count = 0;
        nodes.offer(root);

        while(!nodes.isEmpty()) {
            int len = nodes.size();
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            for(int i = 0; i < len; i++) {
                TreeNode temp = nodes.poll();
                if(count % 2 == 0) {
                    if(temp.val % 2 == 0) return false;
                    if(min >= temp.val) return false;

                } else {
                    if(temp.val % 2 != 0) return false;
                    if(max <= temp.val) return false;
                }
                if(count % 2 == 0) {
                    min = temp.val;
                } else {
                    max = temp.val;
                }
                if(temp.left != null) nodes.offer(temp.left);
                if(temp.right != null) nodes.offer(temp.right);
            }
            count++;
        }
        return true;
    }
}