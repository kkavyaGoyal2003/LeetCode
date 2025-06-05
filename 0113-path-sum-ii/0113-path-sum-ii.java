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
    List<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        makeTargetSum(root, 0, targetSum, list);
        return sol;
    }
    public void makeTargetSum(TreeNode node, int curr, int target, List<Integer> list) {
        if(node == null) return;

        curr += node.val;
        list.add(node.val);
        if(node.left == null && node.right == null) {
            if(curr == target) sol.add(new ArrayList<>(list));
        }
        makeTargetSum(node.left, curr, target, list);
        makeTargetSum(node.right, curr, target, list);
        list.remove(list.size() - 1);
    }
}