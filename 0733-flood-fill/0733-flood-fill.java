class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        int m = image.length;
        int n = image[0].length;

        int[][] dir = {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        int oldColor = image[sr][sc];

        dfs(image, sr, sc, color, oldColor, dir);

        return image;
    }
    public void dfs(int[][] image, int sr, int sc,int color, int oldColor, int[][] dir ) {

        image[sr][sc] = color;
        for(int[] d : dir) {
            int cr = d[0] + sr;
            int cc = d[1] + sc;
            if(cr >= 0  && cr < image.length && cc >=0 && cc < image[0].length && image[cr][cc] == oldColor) {
                dfs(image, cr, cc, color, oldColor, dir);
            }
        }
    }
}