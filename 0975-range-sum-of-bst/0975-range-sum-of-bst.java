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
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stk = new Stack<>();
        int sum = 0;

        while(!stk.isEmpty() || root != null) {
            while(root != null) {
                stk.push(root);
                if(root.val <= low) break;
                root = root.left;
            }
            root = stk.pop();
            if(root.val >= low && root.val <= high) sum += root.val;
            if(root.val >= high) break;
            root = root.right;
        }

        return sum;
    }
}