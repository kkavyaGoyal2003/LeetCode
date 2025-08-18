class Solution {
    int[][] dirs = new int[][]{{-1,0},{-1,-1},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    int m,n;
    public char[][] updateBoard(char[][] board, int[] click) {
        this.m = board.length;
        this.n = board[0].length;
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return board;
        }
        dfs(board, click[0], click[1]);
        return board;
    }

    private void dfs(char[][] board, int r, int c){
        if(r < 0 || c < 0 || r == m || c == n || board[r][c] != 'E') {
            return;
        }
        board[r][c] = 'B';

        int count = countMines(board, r, c);
        if(count == 0){
            for(int[] dir : dirs){
                int cr = dir[0] + r;
                int cc = dir[1] + c;
                dfs(board, cr, cc);
            }
        }else{
            board[r][c] = (char)(count + '0');
        }
    }
    private int countMines(char[][] board, int r, int c){
        int count = 0;
        for(int[] dir: dirs){
            int cr = dir[0] + r;
            int cc = dir[1] + c;
            if(cr>=0 && cc>=0 && cr<m && cc<n && board[cr][cc] == 'M'){
               count++;
            }
        }
        return count;
    }
}