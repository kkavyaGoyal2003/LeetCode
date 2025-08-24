class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int len = s.length();
        int n = indices.length;
        StringBuilder sr = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String temp = sources[i];
            int ind = indices[i];
            int j = 0;
            while(ind < len && j < temp.length() && s.charAt(ind) == temp.charAt(j)) {
                ind++;
                j++;
            }
            if(j == temp.length())  {
                map.put(indices[i], i);
            }
        }
        
        int i = 0;
        while(i < len) {
            if(map.containsKey(i)) {
                sr.append(targets[map.get(i)]);
                i += sources[map.get(i)].length();
            } else {
                sr.append(s.charAt(i));
                i++;
            }
        }

        return sr.toString();
    }
}