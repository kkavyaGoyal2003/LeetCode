class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long zero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
                count += zero;
            } else {
                zero = 0;
            }
        }

        return count;
    }
}
