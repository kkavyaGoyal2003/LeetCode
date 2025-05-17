class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int dis  = 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 1; i < n; i++) {
            dis = Math.max(dis, points[i][0] - points[i-1][0]);
        }

        return dis;
    }
}