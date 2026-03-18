class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] sum = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i==0 && j==0) {
                    sum[i][j] = grid[i][j];
                } else if(i==0) {
                    sum[i][j] = sum[i][j-1] +grid[i][j];
                } else if(j==0) {
                    sum[i][j] = sum[i-1][j] + grid[i][j];
                } else {
                    sum[i][j] = (grid[i][j] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1]);
                }
            }
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(sum[i][j] <= k) count++;
                else break;
            }
        }

        return count;
    }
}