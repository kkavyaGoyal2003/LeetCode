class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;

        int min = 101;
        int max = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            set.add(i);
        }

        List<Integer> li = new ArrayList<>();
        for(int i = min + 1; i < max; i++) {
            if(!set.contains(i)) li.add(i);
        }

        return li;
    }
}