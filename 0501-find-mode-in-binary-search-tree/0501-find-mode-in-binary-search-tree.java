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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        inorder(root, map);
        int max = -1;
        for(Map.Entry<Integer, Integer> ele:  map.entrySet()) {
            max = Math.max(max, ele.getValue());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> ele:  map.entrySet()) {
            if(ele.getValue() == max) list.add(ele.getKey());
        }
        
        int[] sol = new int[list.size()];
        for(int i = 0; i <list.size(); i++) {
            sol[i] = list.get(i);
        }

        return sol;
    }

    public void inorder(TreeNode node, HashMap<Integer, Integer> map){
        if(node != null) {
            inorder(node.left, map);
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            inorder(node.right, map);
        }
    }
}