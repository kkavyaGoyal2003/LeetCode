class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int fresh = 0;
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) fresh++;
                if(grid[i][j] == 2) {
                    que.add(i);
                    que.add(j);
                }
            }
        }
        if(fresh == 0) return 0;
        int time = 0;
        while(!que.isEmpty()) {
            int len = que.size()/2;
            for(int j = 0; j < len; j++) {
                int cr = que.poll();
                int cc = que.poll();
                for(int[] d: dir) {
                    int nr = cr + d[0];
                    int nc = cc + d[1];

                    if(nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        que.add(nr);
                        que.add(nc);
                    }
                }
            }
            if(!que.isEmpty()) time++;
        }

        if(fresh == 0) return time;
        return -1;
    }
}