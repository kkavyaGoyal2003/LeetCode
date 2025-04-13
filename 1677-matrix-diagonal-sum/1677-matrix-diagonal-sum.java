class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int i = 0;
        int sum = 0;

        while(i < n) {
            sum += mat[i][i];
            i++;
        }

        i = 0;
        int j = n-1;
        while(i < n) {
            sum += mat[i][j];
            i++;
            j--;
        }

        if(n % 2 == 0) return sum;

        sum -= mat[n/2][n/2];
        return sum;
    }
}