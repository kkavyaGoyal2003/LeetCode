class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;

        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;
        
        while(left < right) {
            if(height[left] <= height[right]) {
                if(leftMax > height[left]) {
                    sum += leftMax - height[left];
                } else {
                    leftMax = Math.max(leftMax, height[left]);
                }
                left++;
            } else {
                if(rightMax > height[right]) {
                    sum += rightMax - height[right];
                } else {
                    rightMax = Math.max(rightMax, height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}