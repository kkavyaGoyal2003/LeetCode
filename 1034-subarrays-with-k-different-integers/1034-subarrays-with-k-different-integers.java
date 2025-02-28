class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int countK = 0;

        while(j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while(map.size() > k){
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }
            countK += (j - i + 1);
            j++;
        }
        map.clear();
        i = 0;
        j = 0;
        int countK1 = 0;
        while(j < n) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while(map.size() > k- 1){
                if(map.containsKey(nums[i])){
                    map.put(nums[i], map.get(nums[i]) - 1);
                    if(map.get(nums[i]) == 0) map.remove(nums[i]);
                    i++;
                }
            }
            countK1 += (j - i + 1);
            j++;
        }
        return countK - countK1;
    }
}