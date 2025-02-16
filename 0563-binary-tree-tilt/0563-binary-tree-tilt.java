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
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        tilt(root);
        return  sum;
    }
    int sum = 0;
    public int tilt(TreeNode root) {
        if(root == null) return 0;

        int left = tilt(root.left);
        int right = tilt(root.right);

        sum += Math.abs(left - right);

        return left + right + root.val;
    }
}