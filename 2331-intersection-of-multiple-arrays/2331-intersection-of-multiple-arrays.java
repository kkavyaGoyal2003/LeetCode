class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            int val = ele.getValue();
            if(val == n) {
                list.add(ele.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
}