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
    public int findBottomLeftValue(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        
        Queue<TreeNode> que = new LinkedList<>();
        int node = 0;
        que.offer(root);

        while(!que.isEmpty()) {
            int len = que.size();
            for(int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                if(i == 0) node = temp.val;
                if(temp.left != null) que.offer(temp.left);
                if(temp.right != null) que.offer(temp.right);
            }
        }

        return node;
    }
}