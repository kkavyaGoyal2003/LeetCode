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
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        postOrder(root);
    }
    private void postOrder(TreeNode node) {
        if(node != null) {
            postOrder(node.right);
            postOrder(node.left);
            node.left = null;
            node.right = prev;
            prev = node;
        }
    }
}