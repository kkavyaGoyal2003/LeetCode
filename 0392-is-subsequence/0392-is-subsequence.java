class Solution {
    public boolean isSubsequence(String s, String t) {
        return isSeq( s, t, 0, 0);
    }

    public boolean isSeq(String s, String t, int sInd, int tInd) {
        if(sInd == s.length()) return true;
        if(tInd == t.length()) return false;

        if(s.charAt(sInd) == t.charAt(tInd)) return isSeq( s, t, sInd + 1, tInd + 1);

        return  isSeq( s, t, sInd, tInd + 1);
    }
}

