class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        
        list.sort((a,b) -> {
            if(a.getValue() == b.getValue()) {
                if(b.getKey() > a.getKey()) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                if(a.getValue() < b.getValue()) {
                    return -1;
                }
            }
            return 1;
        });
        
        int[] ans = new int[n];
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i).getKey();
            int value = list.get(i).getValue();
            for (int j = 0; j < value; j++) {
                ans[index] = key;
                index++;
            }
        }
        return ans;
    }
}