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
    public int maxLevelSum(TreeNode root) {
        int sum = Integer.MIN_VALUE;
        Queue<TreeNode> que = new LinkedList<>();

        int level = 1;
        int ans = level;

        que.offer(root);
        while(!que.isEmpty()) {
            int len = que.size();
            int temp = 0;
            for(int i = 0; i < len; i++) {
                TreeNode t = que.poll();
                temp += t.val;
                if(t.left != null) que.add(t.left);
                if(t.right != null) que.add(t.right);
            }
            if(sum < temp) {
                sum = temp;
                ans = level;
            }
            level++; 
        }

        return ans;
        
    }
}