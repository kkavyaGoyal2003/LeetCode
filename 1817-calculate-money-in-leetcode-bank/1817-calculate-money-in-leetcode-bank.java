class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int week = 0;
        while (n > 0) {
            for (int i = 1; i <= Math.min(7, n); i++) {
                total += week + i;
            }
            week++;
            n -= 7;
        }
        return total;
    }
}