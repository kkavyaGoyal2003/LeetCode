class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    islands(grid, i, j, dir);
                    count++; 
                }
            }
        }
        return count;
    }
    public void islands(char[][] grid, int r, int c, int[][] dir) {
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;    
        
        grid[r][c] = '0';

        for(int[] d : dir) {
            int cr = d[0] + r;
            int cc = d[1] + c;
            islands(grid, cr, cc, dir);
        }
        
    }
}