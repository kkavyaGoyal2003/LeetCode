class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int i = 0;
        int j = n - 1;
        int sum = 0;
        for(int m = 0; m < k; m++) {
            sum += cardPoints[m];
        }
        
        int max = sum;
        for(int m = 0; m < k; m++) {
            sum -= cardPoints[k - i - 1];
            sum += cardPoints[j];
            max = Math.max(max, sum);
            i++;
            j--;
        }

        return max;
    }
}