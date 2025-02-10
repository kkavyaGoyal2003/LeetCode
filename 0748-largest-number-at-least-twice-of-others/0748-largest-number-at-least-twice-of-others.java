class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        if(n < 2) return -1;
        
        HashMap<Integer, Integer> map =  new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        int num = -1;
        Arrays.sort(nums);
        if(nums[n - 1] >= 2 * nums[n - 2]) {
            num = nums[n - 1];
        }

        if(map.containsKey(num)) {
            return map.get(num);
        }
        
        return -1;
    }
}