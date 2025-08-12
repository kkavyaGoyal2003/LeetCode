class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax= 0;
        int n = brackets.length;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            if (income > brackets[i][0]) {
                tax += (brackets[i][0] - prev) * (brackets[i][1] / 100.0);
                prev = brackets[i][0];
            } else {
                tax += (income - prev) * (brackets[i][1] / 100.0);
                break;
            }
        }
        return tax;
    }
}