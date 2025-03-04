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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> sol = new  ArrayList<>();
        if(root == null) return sol;
        rightView(root, 0 ,sol);
        return sol;
    }
    public void rightView(TreeNode root, int level, List<Integer> list) {
        if(root == null) return;
        if(level == list.size()) {
            list.add(root.val);
        }
        rightView(root.right, level+1, list);
        rightView(root.left, level+1, list);
    }
}