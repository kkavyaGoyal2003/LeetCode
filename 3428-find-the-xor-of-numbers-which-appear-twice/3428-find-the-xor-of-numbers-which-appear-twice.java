class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int xor = 0;
        for(Map.Entry<Integer, Integer> ele: map.entrySet()) {
            if(ele.getValue() == 2) xor ^= ele.getKey();
        }

        return xor;
    }
}