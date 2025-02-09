class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        Arrays.sort(nums);
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0)+ 1);
        }

        for(Map.Entry<Integer,Integer> ele : map.entrySet()) {
            int key = ele.getKey();
            if(map.containsKey(key + 1)) {
                max = Math.max(max, map.get(key) + map.get(key + 1));
            }
        }

        return max;
    }
}