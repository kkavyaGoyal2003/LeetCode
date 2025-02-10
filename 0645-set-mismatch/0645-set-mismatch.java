class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] sol = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            int val = ele.getValue();
            if(val == 0) {
                sol[1] = ele.getKey();
            } 
            if(val == 2) {
                sol[0] = ele.getKey();
            }
        }

        return sol;
    }
}