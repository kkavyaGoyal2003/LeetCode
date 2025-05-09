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
    public int maxDepth(TreeNode root) {
        
        return findHeight(root); 
    }

    public int findHeight(TreeNode root) {
        if(root == null) return 0;
        int height = 0;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        while(!nodes.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = nodes.size();
            for(int i = 0; i < len; i++) {
                TreeNode temp = nodes.poll();
                list.add(temp.val);
                if(temp.left != null) nodes.offer(temp.left);
                if(temp.right != null) nodes.offer(temp.right);
            }
            height++;
        }

        return height;
    }

}