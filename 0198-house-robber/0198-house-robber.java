class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        
        return stealMoney(nums, 0, arr);
    }
    public int stealMoney(int[] nums, int index, int[] arr) {
        if(index >= nums.length) return 0;
        if(arr[index] != -1) return arr[index];

        int case1 = stealMoney(nums, index + 1, arr);
        int case2 = nums[index] + stealMoney(nums, index + 2, arr);
        arr[index] = Math.max(case1, case2);
        return arr[index];
    }
}