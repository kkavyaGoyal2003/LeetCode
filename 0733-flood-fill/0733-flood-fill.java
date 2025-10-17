class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int old = image[sr][sc];
        if(old == color) return image;

        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<Integer> que = new LinkedList<>();
        image[sr][sc] = color;
        que.add(sr);
        que.add(sc);

        while(!que.isEmpty()) {
            int r = que.poll();
            int c = que.poll();

            for(int[] d : dir) {
                int nr = d[0] + r;
                int nc = d[1] + c;

                if(nr >= 0  && nr < m && nc >= 0 && nc < n && image[nr][nc] == old) {
                    image[nr][nc] = color;
                    que.add(nr);
                    que.add(nc);
                }
            }
        }

        return image;
    }
}