class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n = matches.length;
        HashMap<Integer, Integer> won = new HashMap<>();
        HashMap<Integer,Integer> lost = new HashMap<>();

        for(int i = 0; i < n; i++) {
            won.put(matches[i][0], won.getOrDefault(matches[i][0], 0) + 1);
        }

        for(int i = 0; i < n; i++) {
            lost.put(matches[i][1], lost.getOrDefault(matches[i][1], 0) + 1);
        }
        List<Integer> lostzero = new ArrayList<>();
        for(Map.Entry<Integer, Integer> ele : won.entrySet()) {
            int key = ele.getKey();
            if(!lost.containsKey(key)) lostzero.add(key);
        }
        List<Integer> lostone = new ArrayList<>();
        for(Map.Entry<Integer, Integer> ele : lost.entrySet()) {
            int val = ele.getValue();
            if(val == 0) {
                lostzero.add(ele.getKey());
            }
            if(val == 1) {
                lostone.add(ele.getKey());
            }
        }
        Collections.sort(lostzero);
        Collections.sort(lostone);
        List<List<Integer>> list = new ArrayList<>();
        list.add(lostzero);
        list.add(lostone);
        return list;
    }
}