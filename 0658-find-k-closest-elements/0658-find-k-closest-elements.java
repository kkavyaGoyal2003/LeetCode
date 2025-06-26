class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> li = new ArrayList<>();
        int low = 0;
        int high = arr.length - k;

        while(low < high) {
            int mid = low + (high - low) /2;
            int start = x - arr[mid];
            int end = arr[mid + k] - x;

            if(start > end) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        for(int i = low; i < low+k; i++) {
            li.add(arr[i]);
        }

        return li;
    }
}