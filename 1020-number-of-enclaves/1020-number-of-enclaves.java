class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] change = new boolean[m][n];

        for(int i = 0; i < n; i++) {
            if(grid[0][i] == 1 && !change[0][i]) dfs(grid, change, 0, i);
            if(grid[m-1][i] == 1 && !change[m-1][i]) dfs(grid, change, m-1, i);
        }

        for(int i = 1; i < m-1; i++) {
            if(grid[i][0] == 1 && !change[i][0]) dfs(grid, change, i, 0);
            if(grid[i][n-1] == 1 && !change[i][n-1]) dfs(grid, change, i, n-1);
        }

        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0 || change[i][j]) continue;
                count++;
            }
        }

        return count;
    }

    private void dfs(int[][] grid, boolean[][] change, int r, int c) {
        int m = grid.length;
        int n = grid[0].length;
        if(change[r][c]) return;
        change[r][c] = true;
        int[][] dir = {{-1, 0}, { 1, 0}, {0, -1}, {0, 1}};

        for(int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];
            if(nr >= 0 && nr < m  && nc >= 0 && nc < n && grid[nr][nc] == 1) dfs(grid, change, nr, nc);
        }

    }
}
