class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }

        boolean[] visited = new boolean[n];
        boolean[] p_visited = new boolean[n];
        ArrayList<Integer> order = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                if(dfs(i, visited, p_visited, adj, order)) return new int[]{};
            }

        }

        int[] ans = new int[n];
        for(int i = order.size()-1; i >= 0; i--) {
            ans[n-1-i] = order.get(i);
        }
        return ans;
    }

    private boolean dfs(int i, boolean[] visited, boolean[] p_visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> order) {
        if(p_visited[i]) return true;
        if(visited[i]) return false;
        visited[i] = true;
        p_visited[i] = true;

        for(int v : adj.get(i)) {
            if(dfs(v, visited, p_visited, adj, order)) return true;
        }
        p_visited[i] = false;
        order.add(i);
        
        return false;
    }
}