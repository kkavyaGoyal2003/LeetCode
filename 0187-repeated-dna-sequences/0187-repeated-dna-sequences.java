class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length();
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> sol = new HashSet<>();

        for(int i = 9; i < len; i++) {
            String sb = s.substring(i-9, i+1);
            map.put(sb, map.getOrDefault(sb, 0) + 1);
        }
        for(Map.Entry<String, Integer> ele: map.entrySet()) {
            int val = ele.getValue();
            String temp = ele.getKey();
            if(val > 1) {
                sol.add(temp);
            }
        }

        return new ArrayList<>(sol);
    }
}