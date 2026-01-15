class Solution {
    boolean flag;
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] mat = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !mat[i][j]) {
                    flag = false;
                    List<int[]> cells = new ArrayList<>();
                    dfs(board, mat, i, j, cells);
                    if (!flag) {
                        for (int[] cell : cells) {
                            board[cell[0]][cell[1]] = 'X';
                        }
                    }
                }
            }
        }
    }

    private void dfs(char[][] board, boolean[][] mat, int r, int c, List<int[]> cells) {
        int m = board.length;
        int n = board[0].length;

        if (r < 0 || r >= m || c < 0 || c >= n) return;
        if (board[r][c] == 'X' || mat[r][c]) return;

        if (r == 0 || c == 0 || r == m - 1 || c == n - 1) {
            flag = true;
        }

        mat[r][c] = true;
        cells.add(new int[]{r, c});

        dfs(board, mat, r - 1, c, cells);
        dfs(board, mat, r + 1, c, cells);
        dfs(board, mat, r, c - 1, cells);
        dfs(board, mat, r, c + 1, cells);
    }
}
