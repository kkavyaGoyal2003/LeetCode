class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowOne = new int[m];
        int[] rowZero =  new int[m];

        int[] colOne = new int[n];
        int[] colZero = new int[n];

        for(int i = 0; i <m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) rowOne[i]++;
                else rowZero[i]++;
            }
        }

        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j< m; j++) {
                if(grid[j][i] == 1) colOne[i]++;
                else colZero[i]++;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j <n; j++) {
                grid[i][j] = rowOne[i] + colOne[j] - rowZero[i] - colZero[j];
            }
        }

        return grid;
    }
}