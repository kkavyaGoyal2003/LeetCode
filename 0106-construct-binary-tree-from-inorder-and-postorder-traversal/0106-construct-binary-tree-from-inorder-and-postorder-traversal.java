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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return constructTree(postorder, inorder, 0, postorder.length-1, postorder.length-1);
    }
    
    private TreeNode constructTree(int[] postorder, int[] inorder, int start, int end, int index) {

        if(start > end) return null;

        int rootVal = postorder[index];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = map.get(rootVal);



        root.left = constructTree(postorder, inorder, start, rootIndex - 1, index-(end-rootIndex) -1);   
        root.right = constructTree(postorder, inorder, rootIndex + 1,end,  index - 1);   

        return root;
    }
}