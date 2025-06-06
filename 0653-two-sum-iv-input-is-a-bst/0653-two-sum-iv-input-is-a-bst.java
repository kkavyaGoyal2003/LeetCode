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
    public boolean findTarget(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int size = list.size();

        int left = 0;
        int right = size - 1;
        while(left < right) {
            int sum = list.get(left) + list.get(right);
            if(sum == k) {
                return true;
            }
            if(sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public void inorder(TreeNode node, List<Integer>list) {
        if(node != null) {
            inorder(node.left, list);
            list.add(node.val);
            inorder(node.right, list);
        }
    }
}