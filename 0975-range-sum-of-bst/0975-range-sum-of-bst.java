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
        stk.push(root);
        while(!stk.isEmpty()) {
            root = stk.pop();
            // System.out.println(root.val);
            if(root.val >= low && root.val <= high) sum += root.val;

            if(root.val >= high) {
                if(root.left != null) stk.push(root.left);
            } else if(root.val <= low) {
                if(root.right != null) stk.push(root.right);
            } else {
                if(root.right != null) stk.push(root.right);
                if(root.left != null) stk.push(root.left);
            } 
        }

        return sum;
    }
}