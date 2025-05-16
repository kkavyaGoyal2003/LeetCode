class Solution {
    public int search(int[] arr, int target) {
        int len = arr.length;
        int low = 0;
        int high = len-1;

        while(low <= high) {
            int mid = (high - low) / 2 + low;
            if(arr[mid] == target) return mid;

            if(arr[mid] < arr[high]) {
                if(arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if(arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}