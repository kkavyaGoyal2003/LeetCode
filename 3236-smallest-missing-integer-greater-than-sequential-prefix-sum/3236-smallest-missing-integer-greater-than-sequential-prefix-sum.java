class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];

        for(int i = 1; i < n; i++) {
            if(nums[i] - nums[i - 1] == 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        
        while(true) {
            boolean flag = false;
            for(int i = 0; i < n; i++) {
                if(nums[i] == sum) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                sum++;
            } else {
                return sum;
            }
        }
    }
}