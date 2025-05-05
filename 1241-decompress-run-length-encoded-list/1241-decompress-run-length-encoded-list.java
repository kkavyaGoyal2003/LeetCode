class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int len = 0;

        for(int i = 0; i < n; i += 2) {
            len += nums[i];
        }

        int[] list = new int[len];
        int ind = 0;

        for(int i = 0; i < n; i += 2) {
            ind  = subList(list, nums[i], nums[i+1], ind);
        }

        return list;
    }
    public int subList(int[] list, int f, int v, int k) {
        for(int i = f; i > 0; i--) {
            list[k] = v;
            k++;
        }
        
        return k;
    }
}