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
    public TreeNode bstToGst(TreeNode root) {
        return greaterSum(root, root);
    }
    int sum = 0;
    public TreeNode greaterSum(TreeNode root, TreeNode node) {

        if(node != null) {
            greaterSum(root, node.right);
            node.val += sum;
            sum = node.val;
            greaterSum(root, node.left);
        }

        return root;
    }
}