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
    public int sumNumbers(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        return sum(root, 0);
    }

    public int sum(TreeNode node, int total) {
        if(node == null) return 0;

        total = (total * 10) + node.val;
        if (node.left == null && node.right == null) {
            return total;
        }

        return sum(node.left, total) + sum(node.right, total);
    }
}