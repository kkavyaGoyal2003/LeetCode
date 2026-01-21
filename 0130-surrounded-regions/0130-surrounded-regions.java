class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] change = new boolean[m][n];

        for(int i = 0; i < n; i++) {
            if(board[0][i] == 'O' && !change[0][i]) dfs(board, change, 0, i);
            if(board[m-1][i] == 'O' && !change[m-1][i]) dfs(board, change, m-1, i);
        }

        for(int i = 1; i < m-1; i++) {
            if(board[i][0] == 'O' && !change[i][0]) dfs(board, change, i, 0);
            if(board[i][n-1] == 'O' && !change[i][n-1]) dfs(board, change, i, n-1);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'X' || change[i][j]) continue;
                board[i][j] = 'X';
            }
        }
    }

    private void dfs(char[][] board, boolean[][] change, int r, int c) {
        int m = board.length;
        int n = board[0].length;
        if(change[r][c]) return;
        change[r][c] = true;
        int[][] dir = {{-1, 0}, { 1, 0}, {0, -1}, {0, 1}};

        for(int[] d : dir) {
            int nr = r + d[0];
            int nc = c + d[1];
            if(nr >= 0 && nr < m  && nc >= 0 && nc < n && board[nr][nc] == 'O') dfs(board, change, nr, nc);
        }

    }
}