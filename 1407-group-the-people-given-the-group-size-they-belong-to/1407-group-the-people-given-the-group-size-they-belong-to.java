class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> sol = new ArrayList<>();

        for(int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if(!map.containsKey(size)) {
                map.put(size, new ArrayList<>());
            }
            map.get(size).add(i);
            if(map.get(size).size() == size) {
                sol.add(new ArrayList<>(map.get(size)));
                map.get(size).clear();
            }
        }

        return sol;
    }
}