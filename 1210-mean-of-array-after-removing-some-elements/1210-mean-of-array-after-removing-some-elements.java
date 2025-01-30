class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int remove = (n / 20);
        double mean = 0;

        for(int i = remove; i < n - remove; i++) {
            mean += (double)(arr[i]);
        }

        return (mean / (double)(n-2*remove));
    }
}