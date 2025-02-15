class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        double[] avg = new double[n / 2];
        Arrays.sort(nums);

        for(int i = 0; i < n / 2; i++) {
            avg[i] = ((double)nums[i] + (double) nums[n - 1- i]) / 2.0;
        }

        Arrays.sort(avg);
        int count = 1;
        int i = 0;
        int j = 1;

        while(j < n/2) {
            if(avg[i] == avg[j]){
                j++;
            } else {
                i = j; 
                j++;
                count++;
            }
        }

        return count;
    }
}