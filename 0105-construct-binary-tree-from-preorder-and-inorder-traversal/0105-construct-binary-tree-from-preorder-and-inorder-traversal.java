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
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return constructTree(preorder, inorder, 0, preorder.length-1);   
    }
    int index = 0;
    private TreeNode constructTree(int[] preorder, int[] inorder, int start, int end) {

        if(start > end) return null;

        int rootVal = preorder[index++];
        TreeNode root = new TreeNode(rootVal);

        root.left = constructTree(preorder, inorder, start, map.get(rootVal) - 1);   
        root.right = constructTree(preorder, inorder, map.get(rootVal) + 1, end);   

        return root;
    }
}