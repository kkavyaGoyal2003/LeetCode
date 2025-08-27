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
    private int count;
    public int distributeCoins(TreeNode root) {
        this.count = 0;
        dfs(root);
        return count;
    }
    private int dfs(TreeNode node) {
        if(node == null) return 0;

        int extra = node.val - 1;
        int left = dfs(node.left);
        int right = dfs(node.right);

        count += Math.abs(left + right + extra);

        return (left + right + extra);
    }
}