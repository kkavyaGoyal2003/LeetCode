class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        
        for(int i = 0 ; i < indices.length; i++) {
            incRow(mat, indices[i][0], m, n);
            incCol(mat, indices[i][1], m, n);
        }

        return countOddVal(mat, m, n);
    }
    public void incRow(int[][] mat, int r, int m, int n) {
        for(int i = 0; i < n; i++) {
            mat[r][i] += 1;
        }
    }
    public void incCol(int[][] mat, int c, int m, int n) {
        for(int i = 0; i < m; i++) {
            mat[i][c] += 1;
        }
    }

    public int countOddVal(int[][] mat, int m, int n) {
        int count = 0;

        for(int i = 0 ; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] % 2 != 0) count++;
            }
        }

        return count;
    }
}