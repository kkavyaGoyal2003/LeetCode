class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        // int[][] mat = new int[n][n];

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < n; j++) {
        //         mat[i][j] = (i * n) + j;
        //     }
        // }

        int i = 0, j = 0;
        for(String move : commands) {
            if(move.equals("UP")) {
                i -= 1;
            } else if(move.equals("DOWN")) {
                i += 1;
            } else if(move.equals("LEFT")) {
                j -= 1;
            } else if (move.equals("RIGHT")) {
                j += 1;
            }
        }

        return (i * n) + j;
    }

}
