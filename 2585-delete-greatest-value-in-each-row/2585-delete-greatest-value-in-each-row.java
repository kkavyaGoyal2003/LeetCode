class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {

            int max = -1;
            for(int j = 0; j < m; j++) {
                if(max < grid[j][i]) max = grid[j][i];
            }
            sum += max;
        }

        return sum;
    }
}