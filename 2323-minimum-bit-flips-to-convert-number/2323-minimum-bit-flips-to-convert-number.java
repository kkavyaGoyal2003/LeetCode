class Solution {
    public int minBitFlips(int start, int goal) {

        int xor = start ^ goal;
        int count = 0;

        int len = 0;
        int temp = xor;
        while (temp > 0) {
            len++;
            temp >>= 1;
        }

        for(int i = len - 1; i >= 0; i--) {

            temp = 1 << len - 1 - i;
            int n = xor & temp;
            if(n > 0) count++;
        }

        return count;
    }
}