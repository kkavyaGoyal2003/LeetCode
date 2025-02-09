class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int glen = g.length;
        int slen = s.length;

        if(slen == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0; 
        int j = 0;
        int count = 0;

        while(i < glen && j < slen) {
            if(g[i] <= s[j]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}