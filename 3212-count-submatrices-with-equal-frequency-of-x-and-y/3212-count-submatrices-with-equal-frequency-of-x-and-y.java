class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        int[][] count_x = new int[n][m];
        int[][] count_y = new int[n][m];
        if(grid[0][0] == 'X') count_x[0][0] = 1;
        if(grid[0][0] == 'Y') count_y[0][0] = 1; 

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i==0 && j==0) continue;
                
                if(grid[i][j] == 'X') count_x[i][j] += 1;
                if(i==0) {
                    count_x[i][j] += count_x[i][j-1];
                    
                } else if(j==0) {
                    count_x[i][j] += count_x[i-1][j];
                } else {
                    count_x[i][j] += (count_x[i-1][j] + count_x[i][j-1] - count_x[i-1][j-1]);
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(i==0 && j==0) continue;
                
                if(grid[i][j] == 'Y') count_y[i][j] += 1;
                if(i==0) {
                    count_y[i][j] += count_y[i][j-1];
                    
                } else if(j==0) {
                    count_y[i][j] += count_y[i-1][j];
                } else {
                    count_y[i][j] += (count_y[i-1][j] + count_y[i][j-1] - count_y[i-1][j-1]);
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(count_x[i][j]>0 && count_x[i][j] == count_y[i][j]) count++;
            }
        }

        return count;
    }
}