class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        HashMap<Integer, Character> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(indices[i], s.charAt(i));
        }

        StringBuilder str =  new StringBuilder();
        List<Map.Entry<Integer, Character>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());

        for(int i = 0; i < n; i++) {
            str.append(list.get(i).getValue());
        }

        return str.toString();
    }
}