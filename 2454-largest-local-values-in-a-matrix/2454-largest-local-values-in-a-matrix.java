class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] sol = new int[n-2][n-2];

        for(int i = 0; i < n-2; i++) {
            for(int j = 0; j < n-2; j++) {
                sol[i][j] = getMaxGrid(grid, i+1, j+1);
            }
        }

        return sol;
    }

    public int getMaxGrid(int[][] grid, int s, int e) {
        int getMax = -1;

        for(int i = s-1; i <= s+1; i++) {
            for(int j = e-1; j <= e+1; j++) {
                getMax = Math.max(getMax, grid[i][j]);
            }
        }

        return getMax;
    }
}