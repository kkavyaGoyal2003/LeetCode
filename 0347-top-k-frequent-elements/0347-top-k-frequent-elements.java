class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int no : nums) {
            map.put(no ,map.getOrDefault(no, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);

        for(int i=0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }
}