class Solution {
    List<List<Integer>> sol = new ArrayList<>();

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean[][] visited = new boolean[m][n];
                dfs(heights, i, j, visited, dir, heights[i][j]);
                if (po && ao) {
                    sol.add(Arrays.asList(i, j));
                }
                po = false;
                ao = false;
            }
        }

        return sol;
    }

    boolean po = false;
    boolean ao = false;

    private void dfs(int[][] heights, int r, int c, boolean[][] visited, int[][] dir, int prevHeight) {
        int m = heights.length;
        int n = heights[0].length;

        if (r < 0 || c < 0) {
            po = true;
            return;
        }
        if (r >= m || c >= n) {
            ao = true;
            return;
        }
        if (visited[r][c] || heights[r][c] > prevHeight) {
            return;
        }
        visited[r][c] = true;
        for (int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];
            dfs(heights, nr, nc, visited, dir, heights[r][c]);
        }
    }
}

