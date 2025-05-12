class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int max = Collections.max(map.values());

        for(int i = 0; i < max; i++) {
            sol.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> ele: map.entrySet()) {
            int key = ele.getKey();
            int freq = ele.getValue();

            for(int i = 0; i < freq; i++) {
                sol.get(i).add(key);
            }
        }

        return sol;
    }
}