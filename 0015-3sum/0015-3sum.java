class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> sol = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            int target  = -1 * nums[i];
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1; j <n; j++) {
                int comp = target - nums[j];
                if(set.contains(comp)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], comp);
                    Collections.sort(temp);
                    sol.add(temp);
                } else {
                    set.add(nums[j]);
                }
            }
        }

        return new ArrayList<>(sol);
    }
}