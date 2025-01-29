class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length ;
        HashMap<Integer, String> map = new  HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());

        for(int i = 0; i < n; i++) {
            names[n - 1- i] = list.get(i).getValue();
        }

        return names;
    }
}