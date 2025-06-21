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
class BSTIterator {
    private List<Integer> li;
    int index;
    public BSTIterator(TreeNode root) {
        li = new ArrayList<>();
        inorder(root);
        index = 0;
    }
    private void inorder(TreeNode node) {
        if(node != null) {
            inorder(node.left);
            li.add(node.val);
            inorder(node.right);
        }
    }
    
    public int next() {
        // int val = li.get(index);
        // index++;
        // return val;
        return li.get(index++);
    }
    
    public boolean hasNext() {
        if(li.size() == 0) return false;
        if(index == li.size()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */