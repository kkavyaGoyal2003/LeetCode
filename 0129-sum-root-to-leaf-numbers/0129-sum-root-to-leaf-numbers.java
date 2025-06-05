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
        rootToLeaf(root, 0);
        return total;
    }
    int total = 0;
    public void rootToLeaf(TreeNode node, int curr) {
        if(node == null) return;

        curr = (curr*10) + node.val;
        if(node.left == null && node.right == null) total+= curr;

        rootToLeaf(node.left, curr);
        rootToLeaf(node.right, curr);
    }
}