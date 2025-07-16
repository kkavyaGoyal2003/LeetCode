class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int runSum = 0;
        int max = Integer.MIN_VALUE;
        int currStart = 0;
        int end = 0;
        int start = 0;

        for(int i = 0; i < len; i++) {
            runSum += nums[i];
            if(runSum < nums[i]) {
                runSum = nums[i];
                currStart = i;
            }
            if(max < runSum) {
                start = currStart;
                max = runSum;
                end = i;
            }
        }

        System.out.println(start + "  " + end);
        return max;
    }
}