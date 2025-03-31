class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int len = nums.length;
        int maxVal = 0;
        int l = 0;
        int r = 1; 
        
        while (l < len) {
            r = l + 1;
            while(r < len) {
                if (r < len && Math.abs(nums[l] - nums[r]) <= Math.min(nums[l], nums[r])) {
                    maxVal = Math.max(maxVal, nums[l] ^ nums[r]);
                }
                r++;
            }
            l++;
        }

        return maxVal;
    }
}
