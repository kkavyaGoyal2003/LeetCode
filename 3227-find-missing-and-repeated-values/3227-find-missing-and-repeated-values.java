class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] sol = new int[2];
        long gridsum  = 0;
        long gridsq = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                gridsum += grid[i][j];
                gridsq += (long)(grid[i][j] * grid[i][j]);
            }
        }
        
        long high = n * n;
        long sum = ((high) * (high + 1)) / 2;
        long sumsq  = (high * (high + 1) * (2 * high + 1)) / 6;
        long a = gridsum - sum;
        long b = gridsq - sumsq;
        long c = b / a;

        sol[0] = (int) ((a + c) / 2);
        sol[1] = (int)c - sol[0];

        return sol;
    }
}