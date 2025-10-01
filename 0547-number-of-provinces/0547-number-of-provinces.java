class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[n+1];
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                count++;
                dfs(visited, isConnected , i);
            }
        }

        return count;
    }
    private void dfs(boolean[] visited, int[][] isConnected, int v) {
        if(visited[v]) return;

        visited[v] = true;

        for(int i = 0; i < isConnected.length; i++) {
            if(i != v && isConnected[v][i] == 1) dfs(visited, isConnected, i);
        }
    }
}