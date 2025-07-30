/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Queue<Node> que = new LinkedList<>();
        HashMap<Node, Node> map = new HashMap<>();
        Node clone = new Node(node.val);
        map.put(node, clone);
        que.offer(node);
        while(!que.isEmpty()) {
            Node temp = que.poll();
            for(Node n: temp.neighbors) {
                if(!map.containsKey(n)) {
                    Node c = new Node(n.val);
                    map.put(n, c);
                    que.offer(n);
                }
                map.get(temp).neighbors.add(map.get(n));
            }
        }

        return clone;
    } 
}