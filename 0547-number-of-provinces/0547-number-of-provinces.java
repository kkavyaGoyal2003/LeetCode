class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected[0].length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, isConnected, visited);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int node, int[][] isConnected, boolean[] visited) {
        int n = isConnected[0].length;
        visited[node] = true;

        for(int j=0; j<n; j++) {
            if(node == j) continue;
            int neighbour = isConnected[node][j];
            if(neighbour == 1 && !visited[j]) {
                dfs(j, isConnected, visited);
            }
        }
    }
}