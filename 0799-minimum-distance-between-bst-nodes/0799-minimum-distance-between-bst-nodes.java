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
    public int minDiffInBST(TreeNode root) {
        minDis(root);
        return min;
    }
    int min = Integer.MAX_VALUE;
    int prev = -1;
    public void minDis(TreeNode node) {

        if(node == null) return;
        minDis(node.left);

        if(prev != -1) {
            min = Math.min(min, Math.abs(node.val-prev));
        }

        prev = node.val;
        minDis(node.right);
    }

}