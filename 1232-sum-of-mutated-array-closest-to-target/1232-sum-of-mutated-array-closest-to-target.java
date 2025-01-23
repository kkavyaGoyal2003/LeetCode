class Solution {
    public int findBestValue(int[] arr, int target) {
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int num = Integer.MAX_VALUE;
        int low = 0;
        int high = max;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            long sum = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] > mid) {
                    sum += (long)mid;
                } else {
                    sum += (long) arr[i];
                }
            }
            int diff = (int)Math.abs(sum - (long)target);
            if(min > diff) {
                min = diff;
                num = mid;
            } else if(min == diff) {
                num =  Math.min(num, mid);
            }
            if(sum < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return num;
    }
}