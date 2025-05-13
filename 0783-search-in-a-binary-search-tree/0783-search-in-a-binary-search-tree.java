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
    TreeNode node = null;
    public TreeNode searchBST(TreeNode root, int val) {

        if(root == null) return null;

        if(root.val == val) {
            node = root;
        }
        if(root.val > val)  searchBST(root.left, val);
        if(node != null) return node;
        if(root.val < val) searchBST(root.right, val);

        return node;
    }
}