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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> sol = new ArrayList<>();

        if(root == null) return sol;
        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        while(!que.isEmpty()) {
            int len = que.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                max = Math.max(max, temp.val);
                if(temp.left != null) que.add(temp.left);
                if(temp.right != null) que.add(temp.right);
            }
            sol.add(max);
        }

        return sol;
        
    }
}