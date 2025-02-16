class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);   
        while(nums[n -1] != 0) {
            int index = nonzeroEle(nums);
            if(index == -1) return count;
            int nonzero = nums[index];
            for(int i = index; i < n; i++) {
                if(nums[i] > 0) nums[i] -= nonzero;
            }
            count++;
        }
        return count;
    }
    public int nonzeroEle(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                return i;
            }
        }
        return -1;
    }
}