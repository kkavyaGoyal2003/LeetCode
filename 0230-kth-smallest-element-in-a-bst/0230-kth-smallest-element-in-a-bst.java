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
    int res = -1;
    private int inorder(TreeNode root, int k) {
        if(root == null || count > k) return res;

        inorder(root.left, k);
        count++;
        if(count == k) {
            res =  root.val;
            return res;
        }
        
        inorder(root.right, k);

        return res;
    }
}