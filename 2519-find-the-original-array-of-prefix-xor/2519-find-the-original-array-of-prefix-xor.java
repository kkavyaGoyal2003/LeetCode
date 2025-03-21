class Solution {
    public int[] findArray(int[] pref) {
        int len = pref.length;

        for(int i = len-1; i >0; i--) {
            pref[i] = pref[i] ^ pref[i-1];
        }

        return pref;
    }
}