class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums;
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        for(int i = 0; i < even.size(); i++) {
            nums[i] = even.get(i);
        }

        for(int i = 0; i < odd.size(); i++) {
            nums[n-1-i] = odd.get(i);
        }

        return nums;
    }
}