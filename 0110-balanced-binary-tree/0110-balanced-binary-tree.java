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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return checkBalanced(root);
    }
    public boolean checkBalanced(TreeNode root) {
        if(root == null) return true;
        int leftSubtree = findHeight(root.left);
        int rightSubtree = findHeight(root.right);
        
        if(Math.abs(leftSubtree - rightSubtree) > 1) return false;

        boolean ans = (checkBalanced(root.left) && checkBalanced(root.right));
        return  ans;
    } 
    public int findHeight(TreeNode node) {
        if (node == null) return 0;
        
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        return (1 + Math.max(leftHeight, rightHeight));
    }
    
}