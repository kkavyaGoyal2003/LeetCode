class Solution {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        for(char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            max = Math.max(map.get(c), max);
        }

        int maxNum = 0;
        for(char c : map.keySet()) {
            if(map.get(c) == max) {
                maxNum++;
            }
        }

        int partition = max - 1;
        int avail = partition * (n - (maxNum - 1));
        int pending =  len - (max * maxNum);
        int idle = Math.max(0, avail - pending);
        
        return len + idle;
    }
}