class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n-1; i++) {
            int leftSum = 0;
            for(int j=0; j <=i; j++) {
                leftSum += nums[j];
            }
            int rightSum = 0;
            for(int j=i+1; j<n; j++) {
                rightSum += nums[j];
            }

            if(Math.abs(leftSum - rightSum) % 2 == 0) count++;
        }

        return count;
    }
}