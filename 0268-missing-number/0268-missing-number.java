class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] == n || nums[i] == i) continue;

            while(nums[i] != i && nums[i] != n) {
                swap(nums, nums[i], i);
            }
        }

        for(int i = 0; i < n; i++) {
            if(nums[i] != i) return i;
        }

        return n;
    }
    private void swap(int[] nums, int a, int b) {
        nums[a] = nums[a] ^ nums[b];
        nums[b] = nums[a] ^ nums[b];
        nums[a] = nums[a] ^ nums[b];
    }
}