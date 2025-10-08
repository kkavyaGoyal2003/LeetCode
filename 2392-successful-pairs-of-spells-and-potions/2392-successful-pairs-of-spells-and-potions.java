class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];

        Arrays.sort(potions);
        for(int i = 0; i < n; i++) {
            int pos = binarySearch(potions, (long)success, (long)(spells[i]));
            if(pos == m) pairs[i] = 0;
            else pairs[i] = m - pos;
        }

        return pairs;
    }
    private int binarySearch(int[] potions, long success, long spell) {
        int m = potions.length;
        int low = 0;
        int high = m-1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(spell * (long)(potions[mid]) < success) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        return low;
    }
}