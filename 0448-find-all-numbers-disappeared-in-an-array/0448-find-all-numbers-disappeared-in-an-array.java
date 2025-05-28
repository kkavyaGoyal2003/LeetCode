class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> sol = new ArrayList<>();
        int count = 1;
        int i = 0;

        while(i < nums.length) {
            if(nums[i] < count) {
                i++;
            } else if(nums[i] == count) {
                count++;
                i++;
            } else {
                sol.add(count);
                count++;
            }
        }
        while(count <= nums.length) {
            sol.add(count);
            count++;
        }

        return sol;
    }
}