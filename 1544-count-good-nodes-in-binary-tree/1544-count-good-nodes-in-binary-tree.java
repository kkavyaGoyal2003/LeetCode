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
    public int goodNodes(TreeNode root) {
        return isGood(root, root.val);
    }
    public int isGood(TreeNode node, int max) {
        if(node == null) return 0;
        int total = 0;

        if(node.val >= max) {
            total = 1;
        }

        max = Math.max(max, node.val);
        total += isGood(node.left, max);
        total += isGood(node.right, max);

        return total;
    }
}