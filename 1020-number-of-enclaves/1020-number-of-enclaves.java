class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Integer> que = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            if(grid[0][i] == 1) {
                grid[0][i] = 0;
                que.add(0);
                que.add(i);
            }
            if(grid[m-1][i] == 1) {
                grid[m-1][i] = 0;
                que.add(m-1);
                que.add(i);
            }
        }

        for(int i = 1; i < m-1; i++) {
            if(grid[i][0] == 1) {
                grid[i][0] = 0;
                que.add(i);
                que.add(0);
            }
            if(grid[i][n-1] == 1) {
                grid[i][n-1] = 0;
                que.add(i);
                que.add(n-1);
            }
        }

        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        while(!que.isEmpty()) {
            int cr = que.poll();
            int cc = que.poll();
            for(int[] d: dir) {
                int nr = d[0] + cr;
                int nc = d[1] + cc;
                if(nr >=0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                    grid[nr][nc] = 0;
                    que.add(nr);
                    que.add(nc);
                }
            }
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) count++;
            }
        }

        return count;
    }
}
