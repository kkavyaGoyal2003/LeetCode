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
    public TreeNode createBinaryTree(int[][] descriptions) {
        int n = descriptions.length;
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            int  isLeft = descriptions[i][2];

            TreeNode par = map.getOrDefault(parent, new TreeNode(parent));
            TreeNode ch = map.getOrDefault(child, new TreeNode(child));
            
            if (isLeft == 1) {
                par.left = ch;
            } else {
                par.right = ch;
            }
            
            map.put(parent, par);
            map.put(child, ch);
            set.add(child);
        }

        for (int val : map.keySet()) {
            if (!set.contains(val)) {
                return map.get(val);
            }
        }
        
        return null;
    }
}