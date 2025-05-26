class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int dis = 0;

        for(int i : nums) {
            dis += i;
            if(dis == 0) count++;
        }

        return count;
    }
}