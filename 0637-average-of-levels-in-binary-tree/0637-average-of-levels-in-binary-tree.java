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
    public List<Double> averageOfLevels(TreeNode root) {
        return averageLevel(root);
    }

    List<Double> average = new ArrayList<>();

    public List<Double> averageLevel(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        
        while(!nodes.isEmpty()) {
            int len = nodes.size();
            double n = (double)len;
            double sum = 0;
            for(int i = 0; i < len; i++) {
                TreeNode temp = nodes.poll();
                sum += temp.val;
                if(temp.left != null) nodes.offer(temp.left);
                if(temp.right != null) nodes.offer(temp.right);
            }
            double avg = sum / n;
            average.add(avg);
        }

        return average;
    }

}