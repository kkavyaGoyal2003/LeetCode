class Solution {
    public int reductionOperations(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        Arrays.sort(nums);
        int count = 0;
        int index = -1;

        int j = n - 1;
        int i = n - 2;
        while(i >= 0) {
            if(nums[i] != nums[i+1]) {
                count += (n-1-i);
            }
            i--;
        }
        return count;
    }
}