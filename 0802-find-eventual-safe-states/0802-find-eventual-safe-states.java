class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] outdegree = new int[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < graph[i].length; j++) {
                int v = graph[i][j];
                adj.get(v).add(i);
            }
            outdegree[i] = graph[i].length;
        }

        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(outdegree[i] == 0) que.add(i);
        }

        List<Integer> ans = new ArrayList<>();
        while(!que.isEmpty()) {
            int v = que.poll();
            ans.add(v);

            for(int u: adj.get(v)) {
                outdegree[u] -= 1;
                if(outdegree[u] == 0) que.add(u);
            }

        }

        Collections.sort(ans);
        return ans;
    }

}