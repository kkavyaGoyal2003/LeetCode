class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int len1 = items1.length;
        int len2 = items2.length;

        List<List<Integer>> ret = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len1; i++) {
            map.put(items1[i][0], items1[i][1]);
        }

        for(int i = 0; i < len2; i++) {
            if(map.containsKey(items2[i][0])) {
                int sum = map.get(items2[i][0]) + items2[i][1];
                map.put(items2[i][0], sum);
            } else {
                map.put(items2[i][0], items2[i][1]);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());

        for(int i = 0; i < list.size(); i++) { 
            List<Integer> temp = new ArrayList<>();
            temp.add(list.get(i).getKey());
            temp.add(list.get(i).getValue());

            ret.add(temp);
        }

        return ret;
    }
}