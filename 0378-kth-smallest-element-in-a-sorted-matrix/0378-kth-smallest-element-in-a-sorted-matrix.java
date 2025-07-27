class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[m-1][n-1];

        while(low < high) {
            int mid = low + (high - low) / 2;
            int count = countPlace(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    private int countPlace(int[][]matrix, int val) {
        int r = matrix.length - 1;
        int c = 0;

        int count = 0;
        while(r >= 0 && c < matrix[0].length) {
            if(matrix[r][c] <= val) {
                count += r + 1;
                c++;
            } else {
                r--;
            }
        }
        return count;
    }
}