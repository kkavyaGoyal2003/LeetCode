class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] decoded = new int[n+1];

        decoded[0] = first;
        for(int i=1; i < n+1; i++) {
            decoded[i] = encoded[i-1] ^ decoded[i-1];
        }

        return decoded;
    }
}