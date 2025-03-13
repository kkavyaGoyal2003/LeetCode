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
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        inorder(root, nodes);
        return buildTree(nodes, 0, nodes.size() - 1);
    }
    public TreeNode buildTree(List<TreeNode> list, int left, int right) {
        if(left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode root = list.get(mid);

        root.left = buildTree(list, left, mid-1);
        root.right = buildTree(list, mid+1, right);
        return root;
    }
    public void inorder(TreeNode node, List<TreeNode> list) {
        if(node != null) {
            inorder(node.left, list);
            list.add(node);
            inorder(node.right, list);
        }
    }

}