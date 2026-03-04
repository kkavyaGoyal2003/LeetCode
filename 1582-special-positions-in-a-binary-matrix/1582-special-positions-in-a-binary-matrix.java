class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 0) continue;
                if(checkZero(i, j, mat)) count++;
            }
        }
        return count;
    }
    private boolean checkZero(int r, int c, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for(int i=0; i<m; i++) if(i!=r && mat[i][c]==1) return false;

        for(int i=0; i<n; i++) if(i!=c && mat[r][i]==1) return false;

        return true;
    }
}