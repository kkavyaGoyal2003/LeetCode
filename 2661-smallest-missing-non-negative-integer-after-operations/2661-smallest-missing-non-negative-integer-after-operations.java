class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = ((nums[i] % value) + value) % value;
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int x = 0;
        while (true) {
            int mod = x % value;
            if (!freq.containsKey(mod) || freq.get(mod) == 0) {
                return x;
            } else {
                freq.put(mod, freq.get(mod) - 1);
            }
            x++;
        }
    }
}