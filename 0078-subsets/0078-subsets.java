class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  list = new ArrayList<>();
        int n = nums.length;
        list.add(new ArrayList<>());
        for(int i = 0; i < n; i++){
            int len = list.size();
            for(int j = 0; j < len; j++) {
                List<Integer> set = new ArrayList<>(list.get(j));
                set.add(nums[i]);
                list.add(set);
            }
        }
        return list;
    }
}