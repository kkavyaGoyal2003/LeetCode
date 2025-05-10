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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        allPath(root, list, "");

        return list;
    } 

    public void  allPath(TreeNode root, List<String> list, String path) {
        if(root == null) return;

        path += root.val;
        if(root.left == null && root.right == null) {
            list.add(path);
        } else {
            path += "->";
            allPath(root.left, list, path);
            allPath(root.right, list, path);
        }

    }
}