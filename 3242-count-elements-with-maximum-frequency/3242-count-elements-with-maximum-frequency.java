class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+ 1);
            max = Math.max(map.get(n), max);
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> ele: map.entrySet()) {
            if(max == ele.getValue()) count += max;
        }

        return count;
    }
}