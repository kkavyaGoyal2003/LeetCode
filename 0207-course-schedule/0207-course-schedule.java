class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < prerequisites.length; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj.get(v).add(u);
        } 

        int[] visited = new int[numCourses];
        // 1 for cycle // 2 for checked
        for(int i = 0; i < numCourses; i++) {
            if(dfs(i, visited, adj)) return false;
        }
        return true;
    }

    private boolean dfs(int u, int[] visited, ArrayList<ArrayList<Integer>> adj) {
        if(visited[u] == 1) return true;
        if(visited[u] == 2) return false;

        visited[u] = 1;
        ArrayList<Integer> temp = adj.get(u);
        for(int v: temp) {
            if(dfs(v, visited, adj)) return true;
        }
        visited[u] = 2;
        return false;
    }
}