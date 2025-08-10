class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n < 2)return 0;
        int curr = nums[0];
        int steps = 1;
        int next = curr;

        for(int i = 1; i < n; i++){
            next = Math.max(next, nums[i] + i);
            if(i == curr) {
                curr = next;
                if(i != n-1) steps++;
            }
        }

        return steps;
    } 
}