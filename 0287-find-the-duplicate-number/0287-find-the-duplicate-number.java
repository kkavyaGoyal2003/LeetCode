class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for(int i : nums) {
            if(set.contains(i)) return i;
            set.add(i);
        }

        return -1;

        // Arrays.sort(nums);
        // for(int i = 1; i < n; i++) {
        //     if(nums[i-1] == nums[i]) return nums[i]; 
        // }

        // return -1;


    }
}