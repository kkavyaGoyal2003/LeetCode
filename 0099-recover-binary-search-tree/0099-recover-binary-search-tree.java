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
    TreeNode first = null;
    TreeNode sec = null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        first.val = first.val ^ sec.val;
        sec.val = first.val ^ sec.val;
        first.val = first.val ^ sec.val;
    }
    private void inorder(TreeNode node) {
        if(node == null) return;
        
        inorder(node.left);
        if(prev != null && prev.val >= node.val) {
            if(first == null) first = prev;
            sec = node;
        }
        prev = node;
        inorder(node.right);
    }
}