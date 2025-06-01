class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = Integer.MAX_VALUE;
        count = Math.min(count, map.getOrDefault('b', 0));
        count = Math.min(count, map.getOrDefault('a', 0));
        count = Math.min(count, map.getOrDefault('l', 0)/2);
        count = Math.min(count, map.getOrDefault('o', 0)/2);
        count = Math.min(count, map.getOrDefault('n', 0));
        
        return count;
    }
}