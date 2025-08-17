class Solution {
    public int[] singleNumber(int[] nums) {
        int bm = 0;

        for(int i : nums) {
            bm = bm ^ i;
        }

        int differ = (bm & (-bm));
        int num1 = 0;

        for(int i : nums) {
            if((differ & i) != 0) num1 = num1 ^ i;
        }

        return new int[] {num1^bm, num1};
    }
}