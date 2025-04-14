class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m =  matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(luckyNum(matrix, i, j, matrix[i][j])) list.add(matrix[i][j]);
            }
        }

        return list;
    }
    public boolean luckyNum(int[][] matrix, int r, int c, int num) {
        int m =  matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < n; i++) {
            if(matrix[r][i] < num) return false;
        }

        for(int i = 0; i < m; i++) {
            if(matrix[i][c] > num) return false;
        }

        return true;
    }
}