import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        Arrays.sort(nums);

        int start = 0;
        while (start < n && nums[start] == 0) start++;

        int count = 0;
        for (int i = start; i < n - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < n - 1; j++) {
                while (k < n && nums[i] + nums[j] > nums[k]) k++;
                count += k - j - 1;
            }
        }

        return count;
    }
}
