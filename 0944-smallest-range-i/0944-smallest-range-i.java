class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        int diff = max - min;

        return diff <= 2 * k ? 0 : diff - 2 * k;
    }
}