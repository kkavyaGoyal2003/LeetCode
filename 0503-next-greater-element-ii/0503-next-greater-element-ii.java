class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] sol = new int[n];

        for(int i = 0; i < n; i++) {
            boolean flag = true;
            for(int j = i + 1; j < i+n; j++) {
                if(nums[j % n] > nums[i] ) {
                    sol[i] = nums[j % n];
                    flag = false;
                    break;
                }
            }
            if(flag) sol[i] = -1;
        }
        return sol;
    }
}