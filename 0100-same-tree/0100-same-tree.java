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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        return isValid(p , q);
    }
    public boolean isValid(TreeNode p, TreeNode q) {
        TreeNode root1 = p;
        TreeNode root2 = q;
        if(root1 == null && root2 == null) {
            return true;
        } else if((root1 == null && root2 != null) ||  (root1 != null && root2 == null)) {
            return false;
        }
        if(root1.val != root2.val) {
            return false;
        } 
        return isValid(root1.left, root2.left) &&  isValid(root1.right, root2.right);
    }
}