class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m*n - 1;

        while(low <= high) {
            int mid = (high - low) / 2 + low;

            if(matrix[mid / n][mid % n] ==  target) return true;

            if(target < matrix[mid / n][mid % n]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}