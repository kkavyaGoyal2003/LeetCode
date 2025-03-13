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
    int diff = -1;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null ) return 0;

        maxAncestorDiff(root.left);
        maxDiff(root, root);
        maxAncestorDiff(root.right);

        return diff;
    }
    public void maxDiff(TreeNode root, TreeNode node) {
        if(node != null) {
            diff = Math.max(diff, Math.abs(root.val - node.val));
            maxDiff(root, node.left);
            maxDiff(root, node.right);
        }
    }
}