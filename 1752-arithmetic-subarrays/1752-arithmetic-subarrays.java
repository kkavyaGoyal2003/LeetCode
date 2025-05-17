class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = l.length;
        List<Boolean> answer = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            answer.add(isArthimetic(nums, l[i], r[i]));
        }
        
        return answer;
    }
    public int[] subSeq(int[] nums, int l, int r) {
        int[] temp = new int[r-l+1];
        int k = 0;
        for(int i = l; i < r+1; i++) {
            temp[k] = nums[i];
            k++; 
        }

        return temp;
    }
    public boolean isArthimetic(int[] num, int l, int r) {
        int[] nums = subSeq(num, l, r);
        Arrays.sort(nums);
        int diff = nums[1] - nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(diff != nums[i] - nums[i-1]) return false;
        }

        return true;
    }
}
