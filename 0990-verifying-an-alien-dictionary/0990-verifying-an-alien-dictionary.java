class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = words.length;
        if(n == 1) return true;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        for(int k = 1; k < n; k++) {
            String a = words[k - 1];
            String b = words[k];
            int i = 0, j = 0;
            while(i < a.length() && j < b.length()) {
                if(a.charAt(i) != b.charAt(j)) {
                    if(map.get(a.charAt(i)) > map.get(b.charAt(j))) return false;
                    break; 
                }
                i++;
                j++;
            }
            if(i == b.length() && a.length() > b.length()) return false;
        }

        return true;
    }
}
