class Solution {
    public int minimumOperations(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int ops = 0;
        for(int i = 0; i < c; i++) {
            for(int j = 1; j < r; j++) {
                if(grid[j-1][i] >= grid[j][i]) {
                    ops += grid[j-1][i] + 1 - grid[j][i];
                    grid[j][i] = grid[j-1][i] + 1;
                }
            }
        }

        return ops;
    }
}