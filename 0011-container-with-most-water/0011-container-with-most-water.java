class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n -1;
        int max = 0;

        while(i < j) {
            int area = 0;
            if(height[i] < height[j]) {
                area =(height[i]) * (j - i);
                max = Math.max(max, area);
                i++;
            } else {
                area =(height[j]) * (j - i);
                max = Math.max(max, area);
                j--;
            }
        }

        return max;
    }
}