class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int [] arr = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while(j < n2 && i < n1) {
            if(nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(j < n2) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        while(i < n1) {
            arr[k] = nums1[i];
            i++;
            k++;
        }

        i = 0;
        double median = 0;
        int len = arr.length;
        if(len % 2 == 0) {
            median = ((double)arr[len / 2] + (double) arr[(len/2) - 1]) / (double)2;
        } else {
            median = (double)(arr[len / 2]);
        }

        return median;
    }
}