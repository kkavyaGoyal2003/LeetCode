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
    public boolean isValidBST(TreeNode root) {
        
        return inorder(root);
    }

    public boolean inorder(TreeNode root) {
        if(root == null) return true;

        if(!inorder(root.left)) return false;

        if(prev != null && root.val <= prev.val) return false;
        prev = root;

       return inorder(root.right);
    }
}