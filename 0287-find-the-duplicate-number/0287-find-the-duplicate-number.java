class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        cyclicSort(nums);
        for(int i = 0; i < n; i++) {
            if(nums[i] != i+1) return nums[i];
        }
        return -1;
    }
    private void cyclicSort(int[] nums) {
        int count = 0;
        int n = nums.length;
        int i = 0;
        while(i < n) {
            count = 0;
            while(nums[i] != i+1 && count < n) {
                swap(nums, nums[i]-1, i);
                count++;
            }
            if(nums[i] != i+1) return;
            i++;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}