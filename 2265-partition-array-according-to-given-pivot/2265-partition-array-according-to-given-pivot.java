class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int [] sol = new int [n];

        for(int i = 0; i < n; i++) {
            if(nums[i] < pivot) {
                sol[low] = nums[i];
                low++; 
            }
            if(nums[n-1-i] > pivot){
                sol[high] = nums[n-1-i];
                high--;
            }
        }

        while(high >= low) {
            sol[low] = pivot;
            low++;
            sol[high] = pivot;
            high--;
        }

        return sol;
    }
}