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
    int total = 0;
    public void calc(TreeNode node, int[] sum, int[] count) {
        if (node != null) {
            sum[0] += node.val;
            count[0]++;
            calc(node.left, sum, count);
            calc(node.right, sum, count);
        }
    }

    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            int[] sum = new int[1];
            int[] count = new int[1];
            calc(node, sum, count);
            int avg = sum[0] / count[0];
            if (avg == node.val) total++;
            inorder(node.right);
        }
    }

    public int averageOfSubtree(TreeNode root) {
        inorder(root);
        return total;
    }
    
}