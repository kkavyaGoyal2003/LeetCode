class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double max = 0;
        for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    max = Math.max(max, calcArea(points[i], points[j], points[k]));
                }
            }
        }
        return max;
    }
    private double calcArea(int[] a, int[] b, int[] c) {
        double ar =  (0.5 )* Math.abs(a[0]*(b[1]-c[1]) + b[0]*(c[1]-a[1]) + c[0]*(a[1]-b[1]));
        return ar;
    }
}