class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        for(int i = 0 ; i < k; i++) {
            sum += nums[i];
        }

        double avg = sum / k;

        int i = 0; 
        int j = k-1;

        while(j < nums.length) {
            sum -= nums[i];
            i++;
            j++;
            if(j == nums.length)  break;
            sum += nums[j];

            avg = Math.max(avg, sum/k);
        }

        return avg;

    }
}