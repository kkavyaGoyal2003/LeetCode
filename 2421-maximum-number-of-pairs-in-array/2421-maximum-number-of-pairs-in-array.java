class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] sol = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int pairs = 0;
        List<Integer> erase = new ArrayList<>();
        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if(ele.getValue() > 1) {
                pairs += (ele.getValue() / 2);
                map.put(ele.getKey(), ele.getValue() % 2); 
            } 
            if(ele.getValue() == 0) erase.add(ele.getKey());
        }

        for(int i : erase) {
            map.remove(i);
        }
        return new int[] {pairs, map.size()};
    }
}