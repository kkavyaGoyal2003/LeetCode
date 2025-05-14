class Solution {
    public int[] productExceptSelf(int[] nums) { // -1 1 0 -3 3
        int n = nums.length; // 5
        int [] answer = new int[n];
        int prdl = 1;
        answer[0] = 1;
        for(int i=1; i<n; i++){
            prdl *= nums[i-1];
            answer[i] = prdl;
        }
        int prdr = 1;
        for(int i=n-2; i>=0; i--){
            prdr *= nums[i+1];
            answer[i] *= prdr;
        }
        return answer;
    }
}