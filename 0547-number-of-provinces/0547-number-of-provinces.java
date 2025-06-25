class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();

        for(int i = 0; i < n+1; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i  <n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && isConnected[i][j] == 1) {
                    adj.get(i+1).add(j+1);
                }
            }
        }

        int[] visited = new int[n+1];
        int province = 0;

        for(int i = 1; i < n+1; i++) {
            if(visited[i] == 0) {
                province++;
                dfs(i, visited, adj);
            }
        }
        return province;
    }
    private void dfs(int index, int[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[index] = 1;
        for(int d : adj.get(index)) {
            if(visited[d] == 0) dfs(d, visited, adj);
        }
    }


}