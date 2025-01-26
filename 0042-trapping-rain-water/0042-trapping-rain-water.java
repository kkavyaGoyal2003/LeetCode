class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            prefixMax[i] = max;
        }

        max = 0;
        for(int i = n - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            suffixMax[i] = max;
        }

        for(int i = 0 ; i < n; i++) {
            if(height[i] < prefixMax[i] && height[i] < suffixMax[i]){
                int min = Math.min(prefixMax[i], suffixMax[i]);
                sum += min - height[i];
            }
        }
        return sum;
    }
}