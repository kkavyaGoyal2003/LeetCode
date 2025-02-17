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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        int sum = 0;

        que.offer(root);
        while(!que.isEmpty()) {
            int len = que.size();
            sum = 0;
            for(int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                sum += temp.val;
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
            }
        }
        return sum;
    }
}