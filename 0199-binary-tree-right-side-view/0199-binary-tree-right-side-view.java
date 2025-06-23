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
        List<Integer> li = new ArrayList<>();
        buildList(root, li, 0);
        return li;
    }
    private void  buildList(TreeNode node, List<Integer> li, int level) {
        if(node == null) return;
        if(li.size() == level) li.add(node.val);

        buildList(node.right, li, level + 1);
        buildList(node.left, li, level + 1);
    }
}