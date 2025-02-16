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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) {
            return deletenode(root);
        }
        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }
    public TreeNode minValueNode(TreeNode root) {
        TreeNode temp = root;
        while(temp != null && temp.left!= null) {
            temp = temp.left;
        }
        return temp;
    }
    public TreeNode deletenode(TreeNode root) {
        if(root.left == null && root.right == null) {
            return null;
        }
        if(root.left == null) {
            return root.right;
        } 
        if(root.right == null) {
            return root.left;
        }
        TreeNode temp = minValueNode(root.right);
        root.val = temp.val;
        root.right = deleteNode(root.right, temp.val);
        return root;
    }
}