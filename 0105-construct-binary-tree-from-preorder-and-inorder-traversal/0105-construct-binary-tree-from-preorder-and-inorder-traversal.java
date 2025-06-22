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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return constructTree(preorder, inorder);   
    }

    private TreeNode constructTree(int[] preorder, int[] inorder) {

        if(preorder.length == 0) return null;
        int rootVal = preorder[0];
        int ind = -1;
        for(int i = 0; i < inorder.length; i++) {
            if(rootVal == inorder[i]) {
                ind = i;
                break;
            }
        }

        int[] inLeft = Arrays.copyOfRange(inorder, 0,  ind);
        int[] inRight = Arrays.copyOfRange(inorder, ind+1, inorder.length);
        int[] prLeft = Arrays.copyOfRange(preorder, 1,  1+inLeft.length);
        int[] prRight = Arrays.copyOfRange(preorder, 1+ inLeft.length, preorder.length);
        TreeNode root = new TreeNode(rootVal);
        root.left = constructTree(prLeft, inLeft);   
        root.right = constructTree(prRight, inRight);   

        return root;
    }
}