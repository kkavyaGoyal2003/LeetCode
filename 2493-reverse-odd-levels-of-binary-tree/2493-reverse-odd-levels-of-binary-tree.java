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
    public TreeNode reverseOddLevels(TreeNode root) {

        oddLevel(root.left, root.right, 1);
        return root;
    }
    public void oddLevel(TreeNode left, TreeNode right, int level) {
        if(left == null || right == null) return;

        if(level % 2 == 1) {

            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        oddLevel(left.left, right.right, level + 1);
        oddLevel(left.right, right.left, level + 1);
    }
}