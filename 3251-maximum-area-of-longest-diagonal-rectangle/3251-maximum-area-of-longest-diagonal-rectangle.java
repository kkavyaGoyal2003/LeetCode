class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int area = 0;

        for(int[] d : dimensions) {
            double l = (double) (d[0]);
            double b = (double) (d[1]);
            double dig = Math.sqrt(Math.pow(l, 2) + Math.pow(b, 2));

            if(max < dig) {
                max = dig;
                area = d[0] * d[1];
            } else if (max == dig) {
                area  = Math.max(area, d[0] * d[1]);
            }

        }

        return area;
    }
}