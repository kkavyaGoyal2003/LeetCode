class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;

        long sum = 0;
        for(int i = 0; i < k; i++) {
            long temp = (long)(happiness[n-1-i] - i);
            if(temp < 0) sum += 0;
            else sum += temp;
        }

        return sum;
    }
}