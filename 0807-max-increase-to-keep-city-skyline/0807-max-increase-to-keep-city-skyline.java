class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] north = new int[n];
        int[] east = new int[n];

        for(int i = 0; i < n; i++) {
            int maxR = 0;
            int maxC = 0;
            for(int j = 0; j < n; j++) {
                maxR = Math.max(maxR, grid[i][j]);
                maxC = Math.max(maxC, grid[j][i]);
            }
            north[i] = maxC;
            east[i] = maxR;
        }

        //System.out.println(Arrays.toString(north));
        //System.out.println(Arrays.toString(east));

        int sum = 0; 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == east[i] || grid[i][j] == north[j]) continue;
                int min = Math.min(east[i], north[j]);
                sum += (min - grid[i][j]);
            }
        }

        return sum;
    }
}