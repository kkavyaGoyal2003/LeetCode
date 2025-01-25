class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int [] sol = new int[len1];

        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if(nums1[i] == nums2[j]) {
                    for(int k = j + 1; k < len2; k++) {
                        if(nums2[k] > nums2[j]) {
                            sol[i] = nums2[k];
                            break;
                        }
                    }
                    if(sol[i] == 0) {
                        sol[i] = -1;
                    }
                }
            }
        }
        return sol;
    }
}