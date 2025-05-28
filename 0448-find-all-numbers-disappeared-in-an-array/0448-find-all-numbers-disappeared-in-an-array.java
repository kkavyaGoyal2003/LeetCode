class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> sol = new ArrayList<>();
        
        for(int i : nums) {
            if(nums[Math.abs(i) - 1] > 0) {
                nums[Math.abs(i) - 1] *= (-1);   
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) sol.add(i+1);
            else nums[i] *= (-1); 
        }

        return sol;
    }
}