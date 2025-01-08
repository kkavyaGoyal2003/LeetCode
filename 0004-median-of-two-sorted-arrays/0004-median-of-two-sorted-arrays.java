class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int len = n1 + n2;
        int count = 0;
        double median = 0;
        int i = 0;
        int j = 0;
        int num1 = 0;
        int num2 = 0;

        while(j < n2 && i < n1) {
            if(nums1[i] < nums2[j]) {
                if(count == len/2 - 1) num1 = nums1[i];
                if(count == len/2) num2 = nums1[i];
                i++;
            } else {
                if(count == len/2 - 1) num1 = nums2[j];
                if(count == len/2) num2 = nums2[j];
                j++;
            }
            count++;
        }
        while(j < n2) {
            if(count == len/2 - 1) num1 = nums2[j];
            if(count == len/2) num2 = nums2[j];
            count++;
            j++;
        }
        while(i < n1) {
            if(count == len/2 - 1) num1 = nums1[i];
            if(count == len/2) num2 = nums1[i];
            count++;
            i++;
        }
        if(len % 2 == 0) {
            median = ((double)num1 + (double) num2) / (double)2;
        } else {
            median = (double)(num2);
        }

        return median;
    }
}