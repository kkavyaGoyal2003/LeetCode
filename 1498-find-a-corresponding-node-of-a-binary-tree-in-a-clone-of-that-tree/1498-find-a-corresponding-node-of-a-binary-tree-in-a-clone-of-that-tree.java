/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned,
    final TreeNode target) {
        if(cloned == null) {
            return null;
        }
        if(cloned.val == target.val) {
            return cloned;
        }
        TreeNode leftTree = getTargetCopy(original, cloned.left, target);
        if(leftTree != null){
            return leftTree;
        }
        return getTargetCopy(original, cloned.right, target);

    }
}