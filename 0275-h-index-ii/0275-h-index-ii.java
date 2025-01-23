class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0; 
        int high = n - 1;
        int papers = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            if(citations[mid] >= n - mid) {
                papers = n - mid;
                high = mid - 1;
            } else {
                low  = mid + 1;
            }
        }
        return papers;
    }
}