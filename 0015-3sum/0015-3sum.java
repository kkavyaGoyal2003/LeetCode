class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) break;
            if(i != 0 && nums[i] == nums[i-1]) continue;

            int low = i+1;
            int high = n-1;
            int target = ( nums[i] * -1);
            while(low < high) {
                if(nums[low] + nums[high] == target) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[low], nums[high]);
                    sol.add(temp);
                    while(low < high && nums[low] == nums[low + 1]) low++;
                    while(low < high & nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if(nums[low] + nums[high] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return sol;
    }
}