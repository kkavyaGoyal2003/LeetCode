class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int[][] sol = new int[n/3][3];
        int j = 0;
        for(int i = 0; i < n; i += 3) {
            if(nums[i+2] - nums[i] > k) return new int[0][];

            sol[j][0] = nums[i];
            sol[j][1] = nums[i+1];
            sol[j][2] = nums[i+2];
            j++;
        }

        return sol;
    }
}