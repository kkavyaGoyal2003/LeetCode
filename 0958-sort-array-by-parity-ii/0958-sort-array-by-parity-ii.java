class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;

        while(i < j  && j < n) {
            if(i % 2 == 0) {
                if(nums[i] % 2 == 0) {
                    i++;
                    j++;
                } else {
                    if(nums[j] % 2 != 0) {
                        j++;
                    } else {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        i++;
                        j++;
                    }
                }
            } else {
                if(nums[i] % 2 != 0) {
                    i++;
                    j++;
                } else {
                    if(nums[j] % 2 == 0) {
                        j++;
                    } else {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        i++;
                        j++;
                    }
                }
            }
        }

        return nums;
    }
}