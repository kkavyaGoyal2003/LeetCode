class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length ;
        if(n == 3) return nums[n-1] * nums[n-2] * nums[n-3];
        Arrays.sort(nums);

        int posNum = nums[n-1] * nums[n-2] * nums[n-3];
        int negNum = nums[0] * nums[1] * nums[n-1];

        return Math.max(posNum, negNum);
    }
}