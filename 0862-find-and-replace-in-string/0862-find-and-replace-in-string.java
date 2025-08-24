class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int len = s.length();
        int n = indices.length;
        StringBuilder sr = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean[] arr = new boolean[len];

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
                int count = temp.length();
                int pos = indices[i];
                while(count > 0){
                    arr[pos] = true;
                    pos++;
                    count--;
                }
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