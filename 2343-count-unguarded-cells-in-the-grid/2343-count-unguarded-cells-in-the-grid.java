class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] mat = new int[m][n];
        int[][] dir = {{-1,0}, {1, 0}, {0,-1}, {0, 1}};
        
        for(int []g : guards) {
            mat[g[0]][g[1]] = -1;
        }
        for(int []w : walls) {
            mat[w[0]][w[1]] = 1;
        }
        for (int[] g : guards) {
            for (int[] d : dir) {
                int r = g[0] + d[0];
                int c = g[1] + d[1];
                while (r >= 0 && r < m && c >= 0 && c < n && mat[r][c] != 1 && mat[r][c] != -1) {
                    if (mat[r][c] == 0) {
                        mat[r][c] = 2;
                    }
                    r += d[0];
                    c += d[1];
                }
            }
        }

        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) unguarded++;
            }
        }
    return unguarded;

    }
}