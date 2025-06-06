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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        return Sum(root, targetSum);
    }

    public boolean Sum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.right == null && root.left == null) {
            if(root.val == sum) {
                return true;
            }
            return false;
        }
        int remain = sum - root.val;

        return (Sum(root.left, remain) || Sum(root.right, remain));
    }
}