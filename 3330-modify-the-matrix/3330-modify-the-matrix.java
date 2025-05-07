class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> sol = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == -1) {
                    sol.add(getMax(matrix, j));
                }
            }
        }

        int k = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == -1) {
                    matrix[i][j] = sol.get(k);
                    k++;
                }
            }
        }

        return matrix;
    }

    public int getMax(int[][] matrix, int c) {
        int m = matrix.length;
        int n = matrix[0].length;
        int max = -2; 

        for(int i = 0; i < m; i++) {
            max = Math.max(max, matrix[i][c]);
        }

        return max;
    }
}