class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if(n == 1) return 1;
        int dec_len = 1;
        int max_dec = 1;
        int inc_len = 1;
        int max_inc = 1;

        for(int i = 1; i < n; i++) {
            if(nums[i] > nums[i-1]) {
                inc_len++;
            } else {
                max_inc = Math.max(max_inc, inc_len);
                inc_len = 1;
            }
            if(nums[i] < nums[i-1]) {
                dec_len++;
            } else {
                max_dec = Math.max(max_dec, dec_len);
                dec_len = 1;
            }
        }
        max_inc = Math.max(max_inc, inc_len);
        max_dec = Math.max(max_dec, dec_len);
        return Math.max(max_inc, max_dec);
    }
}