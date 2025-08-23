/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String serial = "";
        if(root == null) return serial;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()) {
            TreeNode temp = que.poll();
            if(temp == null) {
                serial += '#';
                serial += ',';
                continue;
            }
            serial += String.valueOf(temp.val);
            serial += ',';
            que.add(temp.left);
            que.add(temp.right);
        }
        StringBuilder sb = new StringBuilder(serial);
        sb.deleteCharAt(serial.length()-1);
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") return null;
        String[] arr = data.split(",");
        Queue<TreeNode> que = new LinkedList<>();
        int i = 0;
        TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
        que.add(root);
        i = 1; 

        while (!que.isEmpty() && i < arr.length) {
            TreeNode temp = que.poll();

            if (i < arr.length && !arr[i].equals("#")) {
                TreeNode templ = new TreeNode(Integer.parseInt(arr[i]));
                temp.left = templ;
                que.add(templ);
            }
            i++;

            if (i < arr.length && !arr[i].equals("#")) {
                TreeNode tempr = new TreeNode(Integer.parseInt(arr[i]));
                temp.right = tempr;
                que.add(tempr);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));