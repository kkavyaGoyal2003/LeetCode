class Solution {
    public int longestOnes(int[] nums, int k) {
        int n =  nums.length;
        int maxLen = 0;
        int countZero = 0;
        int left = 0;
        int right = 0;

        while(right < n) {
            if(nums[right] == 0) countZero++;
            if (countZero > k) {
                if(nums[left] == 0) countZero--;
                left++;
            } else {
                maxLen = Math.max(maxLen, right - left + 1);
            } 
            right++;
        }

        return maxLen;
    }
}