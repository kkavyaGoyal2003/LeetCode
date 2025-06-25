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
                Queue<Integer> que = new LinkedList<>();
                visited[i] = 1; 
                que.add(i);
                province++;
                while(!que.isEmpty()) {
                    for(int j : adj.get(que.poll())) {
                        if(visited[j] == 0) {
                            visited[j] = 1;
                            que.add(j);
                        }
                    }
                }
            }
        }
        return province;
    }
}