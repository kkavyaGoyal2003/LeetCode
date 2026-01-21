class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        //Colors are : -1, -2
        for(int j = 0; j < n; j++){
            if(color[j] != 0) continue;
            color[j] = -1;
            if(!dfs(graph, j, color)) return false;
            
        }
        return true;
    }
    private boolean dfs(int[][] graph, int node, int[] color) {

        for(int i = 0; i < graph[node].length; i++) {
            int v = graph[node][i];

            if(color[v] == 0) {
                if(color[node] == -1) color[v] = -2;
                else color[v] = -1;
                if(!dfs(graph, v, color)) return false;
            } else {
                if(color[v] == color[node]) return false;
            }
        }
        return true;
    }
}