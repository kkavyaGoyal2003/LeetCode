class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int[] ans = nums;
        while(n != 1) {
            int[] temp = new int[n-1];
            for(int i = 0; i < n-1; i++) {
                temp[i] = (ans[i] + ans[i+1]) % 10;
            }
            n--;
            ans = temp;
        }

        return ans[0];
    }
}