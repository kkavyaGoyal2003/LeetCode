class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        int sum = 0;
        for(int i = n/3 ; i < n; i += 2) {
            sum += piles[i];
        }
        return sum;
    }
}