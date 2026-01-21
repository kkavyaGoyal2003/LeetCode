class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] change = new boolean[m][n];
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            if(board[0][i] == 'O' )  {
                change[0][i] = true;
                que.add(0);
                que.add(i);
            }
            if(board[m-1][i] == 'O')  {
                change[m-1][i] = true;
                que.add(m-1);
                que.add(i);
            }
        }

        for(int i = 1; i < m-1; i++) {
            if(board[i][0] == 'O') {
                change[i][0] = true;
                que.add(i);
                que.add(0);
            }
            if(board[i][n-1] == 'O') {
                change[i][n-1] = true;
                que.add(i);
                que.add(n-1);
            }
        }

        int[][] dir = {{-1,0}, {1, 0}, {0,-1}, {0,1}};
        while(!que.isEmpty()) {
            int cr = que.poll();
            int cc = que.poll();
            for(int[] d: dir) {
                int nr = d[0] + cr;
                int nc = d[1] + cc;
                if(nr >= 0 && nr < m && nc >= 0&& nc < n && !change[nr][nc] && board[nr][nc] == 'O') {
                    change[nr][nc] = true;
                    que.add(nr);
                    que.add(nc);
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'X' || change[i][j]) continue;
                board[i][j] = 'X';
            }
        }
    }

}