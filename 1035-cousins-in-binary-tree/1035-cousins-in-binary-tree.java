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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(depthOfNode(root, x) == depthOfNode(root, y)) {
            return !isParent(root, x, y);
        }

        return false;
    }
    public int depthOfNode(TreeNode root, int val) {
        int level = 0;
        Queue<TreeNode> node = new LinkedList<>();
        
        node.offer(root);
        while(!node.isEmpty()) {
            int len = node.size();
            for(int i = 0; i < len; i++) {
                TreeNode temp = node.poll();
                if(temp.val == val) {
                    level++;
                    return level;
                }
                if(temp.left != null) node.offer(temp.left);
                if(temp.right != null) node.offer(temp.right);
            }
            level++;
        }

        return level;
    }

    public boolean isParent(TreeNode root, int x , int y) {
        if(root == null) return false;
        if (root.left != null &&  root.right != null) {
            if(root.left.val ==  x && root.right.val == y) return true;
            if(root.left.val ==  y && root.right.val == x) return true;
        }

        return isParent(root.left, x, y) || isParent(root.right, x, y);
    }
}