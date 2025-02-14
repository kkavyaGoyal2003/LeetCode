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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode original = root;
        if(root ==  null) {
            TreeNode node = new TreeNode(val);
            return node;
        }
        insert(root, original, val);
        return root;
    }
    public TreeNode insert(TreeNode root, TreeNode original, int val) {
        if(root.left == null && root.right == null) {
            if(val > root.val) {
                TreeNode node = new TreeNode(val);
                root.right = node;
            } else {
                TreeNode node = new TreeNode(val);
                root.left = node;
            }
        } else {
            if(val > root.val) {
                if(root.right == null) {
                    TreeNode node = new TreeNode(val);
                    root.right = node;
                    return original;
                }
                insert(root.right, original, val);
            } else {
                if(root.left == null) {
                    TreeNode node = new TreeNode(val);
                    root.left = node;
                    return original;
                }
                insert(root.left, original, val);
            }
        }
        return original;
    }
}