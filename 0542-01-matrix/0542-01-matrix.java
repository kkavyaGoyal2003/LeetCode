class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat == null || mat.length == 0) return mat;
        int m = mat.length;
        int n = mat[0].length;
        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    que.add(i);
                    que.add(j);
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        while(!que.isEmpty()) {
            int cr = que.poll();
            int cc = que.poll();
            for(int[] d : dir) {
                int nr = d[0] + cr;
                int nc = d[1] + cc;
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && mat[nr][nc] == -1) {
                    mat[nr][nc] = mat[cr][cc] + 1;
                    que.add(nr);
                    que.add(nc); 
                }
            }
            
        }
        
        return mat;
    }
}