class Solution {
    public int numberOfSubstrings(String s) {
		int len = s.length();
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		int l = 0;
		int r = 0;

		while(r < len) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            r++;
			while(map.size() >= 3) {
                if(map.size() == 3) {
                    count += len - (r - 1);
                }
                map.put(s.charAt(l), map.get(s.charAt(l))- 1);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;
            }
		}

		return count;
    }
}