class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = nums.length;
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(left < len) {
            if(nums[left] > threshold || nums[left] % 2 != 0) {
                left ++;
                continue;
            }
            right = left;

            while(right < len && nums[right] <= threshold && (right == left || nums[right] % 2!= nums[right-1] % 2)) {

                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }           

            left = right; 
        }

        return maxLen;
    }
}