class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        addQueen(board, 0, n);
        return result;
    }
    private void addQueen(boolean[][] board, int r, int n) {
        if(r == n) {
            List<String> li = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                StringBuilder str = new StringBuilder();
                for(int j = 0; j < n; j++) {
                    if(board[i][j] == true) {
                        str.append('Q');
                    } else {
                        str.append('.');
                    }
                }
                li.add(str.toString());
            }
            result.add(li);
        }
        for(int c = 0; c < n; c++) {
            if(isValid(r, c, board, n)) {
                board[r][c] = true;
                addQueen(board, r+1, n);
                board[r][c] = false;
            } 
        }
    } 
    private boolean isValid(int r, int c, boolean[][] board, int n) {
        for(int i = 0; i < r; i++) {
            if(board[i][c]) return false;
        }

        int i = r-1;
        int j = c-1;
        while(i >= 0 && j >= 0) {
            if(board[i][j]) return false;
            i--;
            j--;
        }
        
        i = r-1;
        j = c+1;
        while(i >= 0 && j < n) {
            if(board[i][j]) return false;
            i--;
            j++;
        }

        return true;
    }
}