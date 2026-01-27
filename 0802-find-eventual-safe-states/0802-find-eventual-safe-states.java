class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < graph[i].length; j++){
                adj.get(i).add(graph[i][j]);
            }
        }

        int[] visited = new int[n];
        boolean[] safe = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(visited[i]==0) dfs(i,adj, visited, safe);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(safe[i] == true) ans.add(i);
        }
        return ans;
    }

    private boolean dfs(int u, List<List<Integer>> adj, int[] visited, boolean[] safe) {
        
        if(visited[u] == 1) return false;
        if(visited[u] == 2) return true;
        visited[u] = 1;

        for(int v : adj.get(u)) {
            if(!dfs(v, adj, visited, safe)) return false;
        }
        visited[u] = 2;
        safe[u] = true;

        return true;
    }
    
}