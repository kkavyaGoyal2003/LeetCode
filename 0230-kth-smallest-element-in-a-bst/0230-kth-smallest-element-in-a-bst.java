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
        inorder(root, k);
        return value;
    }
    int count = 0;
    int value = 0;
    private void inorder(TreeNode root, int k) {
        if(root == null) return;

        inorder(root.left, k);
        count++;
        if(count == k) {
            value = root.val;
            return;
        }
        inorder(root.right, k);
    }
}