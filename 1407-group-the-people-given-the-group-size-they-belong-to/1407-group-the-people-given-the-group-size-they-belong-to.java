class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int len = groupSizes[i];
            
            if(!map.containsKey(len)) {
                map.put(len, new ArrayList<>());
            }

            map.get(len).add(i);

            if(map.get(len).size() == len) {
                ans.add(new ArrayList<>(map.get(len)));
                map.put(len, new ArrayList<>());
            }
        }

        return ans;
    }
}