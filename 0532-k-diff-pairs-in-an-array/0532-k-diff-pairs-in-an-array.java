class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val, map.getOrDefault(val, 0)+1);
        }

        int count = 0;
        for(int key : map.keySet()) {
            if(k == 0) {
                if(map.get(key) > 1) count++;
            } else {
                if(map.containsKey(key + k)) count++;
            }
        }
        return count;
    }
}