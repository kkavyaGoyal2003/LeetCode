class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        int m = image.length;
        int n = image[0].length;

        Queue<Integer> que = new LinkedList<>();
        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        int oldColor = image[sr][sc];

        image[sr][sc] = color;
        que.add(sr);
        que.add(sc);

        while(!que.isEmpty()) {
            int cr = que.poll();
            int cc = que.poll();
            for(int[] d : dir) {
                int row = d[0] + cr;
                int col = d[1] + cc;
                if(row >= 0 && col >= 0 && col < n && row < m && image[row][col] == oldColor) {
                    image[row][col] = color;
                    que.add(row);
                    que.add(col);
                }
            }
        }

        return image;
    }
}