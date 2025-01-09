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
    public int diameterOfBinaryTree(TreeNode root) {

        return findDiameter(root);
    }
    public int findHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return (1 + Math.max(leftHeight, rightHeight));
    }
    int maxHeight = 0;
    public int findDiameter(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        maxHeight = Math.max(maxHeight, leftHeight+rightHeight);

        findDiameter(node.left);
        findDiameter(node.right);

        return maxHeight;
    }
}