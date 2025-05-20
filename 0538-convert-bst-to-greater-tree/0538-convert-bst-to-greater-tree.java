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
    public TreeNode convertBST(TreeNode root) {
        inorder(root);
        return root;
    }
    int sum  = 0;
    
    public void inorder(TreeNode node) {
        if(node != null) {
            inorder(node.right);
            int temp = node.val;
            node.val = node.val + sum;
            sum = sum + temp;
            inorder(node.left);
        }
    }
}