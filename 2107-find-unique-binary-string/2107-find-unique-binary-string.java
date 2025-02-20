class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        StringBuilder ans = new StringBuilder();    
        for(int j = 0; j < n; j++) {
            char bit = (nums[j].charAt(j) == '0' ? '1' : '0' );
            ans.append(bit);
        }
        return ans.toString();
    }
}