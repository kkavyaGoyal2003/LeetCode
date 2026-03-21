class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int l = 0;
        int half = k/2;
        int i = x;
        while(half > 0) {
            for(int j = y; j < (y+k); j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[x+k-1-l][j];
                grid[x+k-1-l][j] = temp;
            }
            i++;
            half--;
            l++;
        }

        return grid;
    }
}