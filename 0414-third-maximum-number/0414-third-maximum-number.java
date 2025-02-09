class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n < 3) return nums[n - 1];

        int count = 0;
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] != nums[i + 1]) {
                count++;
            }
            if(count == 2) return nums[i];
        }

        return nums[n - 1];
    }
}