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
    List<TreeNode> pathP;
    List<TreeNode> pathQ;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        findPath(root, p, q, new ArrayList<>());
        for(int i = 0; i < pathP.size(); i++) {
            if(pathP.get(i).val != pathQ.get(i).val) return pathP.get(i-1);
        }

        return null;
    }
    private void findPath(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> path) {
        if(root == null) return;

        path.add(root);
        if(root.val == p.val) {
            pathP = new ArrayList<>(path);
            pathP.add(p);
        }
        if(root.val == q.val) {
            pathQ = new ArrayList<>(path);
            pathQ.add(q);
        }

        findPath(root.left, p, q, path);
        findPath(root.right, p, q, path);
        path.remove(path.size()-1);
    }
}