class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int neg = -1;
        int pos = n;

        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) neg = i;
        }

        for(int i = 0; i < n; i++) {
            if(nums[i] >= 0) {
                pos = i;
                break;
            }
        }

        int[] sqrSorted = new int[n];
        int i = 0;

        while(neg >= 0 && pos < n) {
            if(Math.abs(nums[neg]) > Math.abs(nums[pos])) {
                sqrSorted[i] = nums[pos] * nums[pos];
                pos++;
            } else {
                sqrSorted[i] = nums[neg] * nums[neg];
                neg--;
            }
            i++;
        }

        while(neg >= 0) {
            sqrSorted[i] = nums[neg] * nums[neg];
            neg--;
            i++;
        }

        while(pos < n) {
            sqrSorted[i] = nums[pos] * nums[pos];
            pos++;
            i++; 
        }

        return sqrSorted;
    }
}