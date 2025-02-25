class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int totalFruits = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i =0; 
        int j = 0;

        while(j < n) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            if(map.size() > 2) {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if(map.get(fruits[i]) == 0) map.remove(fruits[i]);
                i++;
            }
            
            totalFruits = Math.max(totalFruits, j-i+1);
            j++;
        }
        return totalFruits;
    }
}