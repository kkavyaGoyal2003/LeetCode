class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected[0].length;
        boolean[] visited = new boolean[n];

        Queue<Integer> que = new LinkedList<>();
        int provinces = 0;
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                que.add(i);
                visited[i] = true;
                provinces++;
            }

            while(!que.isEmpty()) {
                int node = que.poll();

                for(int j=0; j<n; j++) {
                    if(node == j) continue;
                    int neighbour = isConnected[node][j];
                    if(neighbour == 1 && !visited[j]) {
                        que.add(j);
                        visited[j] = true;
                    }
                }
            }
            
        }
        return provinces;
    }
}