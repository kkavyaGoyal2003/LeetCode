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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return inorder(root);
    }
    public boolean inorder(TreeNode root) {
        if(root != null) {
            inorder(root.left);
            height(root);
            if(flag == false) return false;
            inorder(root.right);
        }
        return true;
    } 
    public int height(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if(Math.abs(leftHeight - rightHeight) > 1) {
            flag = false;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

}