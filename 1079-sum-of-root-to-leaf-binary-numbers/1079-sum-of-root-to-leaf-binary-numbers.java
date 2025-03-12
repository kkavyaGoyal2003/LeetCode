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
    public int sumRootToLeaf(TreeNode root) {
        LeafBinary(root, "");
        return total;
    }

    public void LeafBinary(TreeNode node, String sum) {
        if(node == null) return;
        
        sum += node.val;
        if(node.left == null && node.right == null) {
            total += Integer.parseInt(sum, 2);
        } else {
            LeafBinary(node.left, sum);
            LeafBinary(node.right, sum);
        }
    }
}