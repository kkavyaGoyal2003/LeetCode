class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length; 
        int max = 0; 
        Arrays.sort(citations);

        for(int i = 1; i <= n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(citations[j] >= i) count++;
            }
            if(count >= i) max = Math.max(max, i);
        }
        return max;
    }
}