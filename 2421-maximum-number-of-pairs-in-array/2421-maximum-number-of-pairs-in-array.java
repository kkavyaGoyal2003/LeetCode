class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];

        for(int i : nums) {
            freq[i] += 1;
        }

        int pairs = 0;
        int left = 0;
        for(int i  = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                if(freq[i] % 2 == 0) {
                    pairs +=  freq[i] / 2;
                } else {
                    if(freq[i] > 1) pairs +=  freq[i] / 2;
                    left++;
                }
            }
        }
        return new int[] {pairs, left};
    }
}