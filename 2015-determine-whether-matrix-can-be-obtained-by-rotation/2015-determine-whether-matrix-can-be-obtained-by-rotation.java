class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(isEqual(mat, target)) return true;

        for(int i = 1; i < 4; i++) {
            rotateMatrix(mat);
            if(isEqual(mat, target)) return true;
        }

        return false;
    }
    public boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length; 

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] != target[i][j]) return false;
            }
        }

        return true;
    }
    public void rotateMatrix(int[][] mat) {
        int n = mat.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                int temp = mat[i][n-1-j];
                mat[i][n-1-j] = mat[i][j];
                mat[i][j] = temp;
            }
        } 
    }
}