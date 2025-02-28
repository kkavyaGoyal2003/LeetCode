class Solution {
    public int numberOfSubstrings(String s) {
		int len = s.length();
		int[] lastseen = new int[3];
        Arrays.fill(lastseen, -1);
        int count = 0;

        for(int i = 0; i < len; i++) {
            lastseen[s.charAt(i) - 'a'] = i;
            count += (1 + Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2])));
        }

		return count;
    }
}