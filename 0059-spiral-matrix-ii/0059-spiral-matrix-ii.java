class Solution {
    public int[][] generateMatrix(int n) {
        int[][] grid = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;
        int count = 1;

        while(top < bottom+1 && left < right+1) {
            for(int i = left; i < right+1; i++) {
                grid[top][i] = count;
                count++;
            }
            top++;

            for(int i = top; i < bottom+1; i++) {
                grid[i][right] = count;
                count++;
            }
            right--;

            if(top < bottom+1) {
                for(int i = right; i >= left; i--) {
                    grid[bottom][i] = count;
                    count++;
                }
                bottom--;
            }

            if(left < right+1) {
                for(int i = bottom; i >= top; i--) {
                    grid[i][left] = count;
                    count++;
                }
                left++;
            }
        }

        return grid;
    }
}