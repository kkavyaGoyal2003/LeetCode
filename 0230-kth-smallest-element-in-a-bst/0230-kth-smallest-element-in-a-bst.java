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
    public int kthSmallest(TreeNode root, int k) {
        return inorder(root, k);
    }
    int count = 0;
    private int inorder(TreeNode root, int k) {
        if(root == null || count > k) return Integer.MAX_VALUE;

        int left = inorder(root.left, k);
        count++;
        if(count == k) return root.val;
        int right = inorder(root.right, k);

        if(left != Integer.MAX_VALUE) return left;
        if(right != Integer.MAX_VALUE) return right;
        return Integer.MAX_VALUE;
    }
}