class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int right_prd = 1;
        answer[n-1] = 1;
        for(int i = n-2; i >= 0; i--) {
            right_prd *= nums[i + 1];
            answer[i] = right_prd;
        }

        int left_prd = 1;
        for(int i = 1; i < n; i++) {
            left_prd *= nums[i - 1];
            answer[i] *= left_prd;
        }

        return answer;
    }
}