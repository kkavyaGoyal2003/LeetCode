class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        //Colors are : -1, -2
        for(int j = 0; j < n; j++){
            if(color[j] != 0) continue;
            Queue<Integer> que = new LinkedList<>();
            que.add(j);
            color[j] = -1;
            while(!que.isEmpty()) {
                int node = que.poll();
                for(int i = 0; i < graph[node].length; i++) {
                    int v = graph[node][i];
                    if(color[v] == 0) {
                        que.add(v);
                        if(color[node] == -1) color[v] = -2;
                        else color[v] = -1;
                    } else {
                        if(color[node] == color[v]) return false;
                    }
                }
            }
        }
        

        return true;
    }
}