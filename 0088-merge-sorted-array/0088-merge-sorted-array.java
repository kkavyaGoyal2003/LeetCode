class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m+n-1;
        int mL = m - 1;
        int nL = n - 1;

        while(mL >= 0 && nL >= 0) {
            if(nums2[nL] > nums1[mL]) {
                nums1[end] = nums2[nL];
                nL--;
            } else {
                nums1[end] = nums1[mL];
                mL--;
            }
            end--;
        }

        while(nL >= 0) {
            nums1[end] = nums2[nL];
            nL--;
            end--;
        }
    }
}