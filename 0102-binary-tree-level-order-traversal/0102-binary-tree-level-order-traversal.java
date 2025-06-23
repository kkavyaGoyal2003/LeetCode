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
 /*
            3
        9       20
            15      7
 */
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        levelValue(root, 0);
        return result;
    }
    List<List<Integer>> result = new ArrayList<>();
    public void levelValue(TreeNode node, int level) {
        if(node == null) return;

        if(level == result.size()) result.add(new ArrayList<>());
        result.get(level).add(node.val);
        levelValue(node.left, level+1);
        levelValue(node.right, level + 1);
       
    }
}