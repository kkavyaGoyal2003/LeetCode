class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] e: edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }


        boolean[] visited = new boolean[n];
        ArrayList<ArrayList<Integer>> comp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
               ArrayList<Integer> temp = new ArrayList<>();
               dfs(visited, temp, adj, i);
               comp.add(temp);
            }
        }

        int count = 0;
        for (ArrayList<Integer> temp : comp) {
            boolean isComplete = true;
            int size = temp.size();
            for (int node : temp) {
                if (adj.get(node).size() != size - 1) {
                    isComplete = false;
                    break;
                }
            }

            if (isComplete) count++;
        }
        return count;
    }
    private void dfs(boolean[] visited, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> adj, int i) {
        if(visited[i]) return;

        visited[i] = true;
        temp.add(i);

        for(int v : adj.get(i)) {
            dfs(visited, temp, adj, v);
        }
        
    }
}