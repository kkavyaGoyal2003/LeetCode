class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while(i < j) {
            if(nums[i]  % 2 == 0 && nums[j] % 2 == 1) {
                i++;
                j--;
            } else if(nums[i]  % 2 == 0 && nums[j] % 2 == 0) {
                i++;
            } else if(nums[i]  % 2 == 1 && nums[j] % 2 == 1) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        return nums;
    }
}