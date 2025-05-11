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
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        int min = preorder(root, set, root.val);

        long ans = Long.MAX_VALUE;

        for(int i : set) {
            if(i > min) {
                ans = Math.min(ans, i);
            }
        }

        if(ans != Long.MAX_VALUE) return (int)ans;
        return -1; 
    }
    public int preorder(TreeNode node, HashSet<Integer> set, int min) {
        if(node != null) {
            set.add(node.val);
            min = Math.min(min, node.val);
            preorder(node.left, set, min);
            preorder(node.right, set, min);
        }
        return min;
    }
}