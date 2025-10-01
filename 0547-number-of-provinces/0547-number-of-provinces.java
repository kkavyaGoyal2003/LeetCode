class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                if(isConnected[i][j] == 1) {
                    adj.get(i+1).add(j+1);
                }
            }
        }

        int count = 0;
        boolean[] visited = new boolean[n+1];
        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                count++;
                dfs(visited, adj, i);
            }
        }

        return count;
    }
    private void dfs(boolean[] visited, ArrayList<ArrayList<Integer>> adj, int v) {
        if(visited[v]) return;

        visited[v] = true;
        ArrayList<Integer> temp = adj.get(v);

        for(int e : temp){
            dfs(visited, adj, e);
        }
    }
}