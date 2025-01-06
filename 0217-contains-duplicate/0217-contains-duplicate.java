class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i : nums){
            if(map.containsKey(i)) {
                map.put(i, map.getOrDefault(i , 1) + 1);
            } else {
                map.put(i , 1);
            }
        }

        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            int val = ele.getValue();
            if(val > 1) {
                return true;
            }
        }
        return false;
    }
}