class Solution {
    private int[][] memo;
    public int minFallingPathSum(int[][] matrix) {
        memo = new int[matrix.length][matrix[0].length];
        int min = Integer.MAX_VALUE;
        for(int[] arr : memo) {
            Arrays.fill(arr, Integer.MAX_VALUE);
        }

        for(int i = 0; i < matrix[0].length; i++) {
            min = Math.min(min , helper(matrix, 0, i));
        }
        return min;
    }
    public int helper(int[][] mat, int r, int c) {
        if (c < 0 || c >= mat[0].length) return Integer.MAX_VALUE; 

        if (r == mat.length - 1) return mat[r][c];
        if(memo[r][c] != Integer.MAX_VALUE) return memo[r][c];

        int down = helper(mat, r+1, c);
        int left = helper(mat, r+1, c-1);
        int right = helper(mat, r+1, c+1);

        memo[r][c] = mat[r][c] + Math.min(left, Math.min(down, right));
        return memo[r][c];
    }
}