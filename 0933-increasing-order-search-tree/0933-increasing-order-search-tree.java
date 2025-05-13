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
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return newRoot;
    }
    TreeNode newRoot = null;
    TreeNode temp = null;
    public void inorder(TreeNode root) {
        if(root != null) {
            inorder(root.left);
            if(newRoot == null) {
                newRoot = root;
                temp = newRoot;
            } else {
                temp.right = root;
                temp = root;
            }
            root.left = null;
            inorder(root.right);
        }        
    }
}