class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(tops[i], map.getOrDefault(tops[i], 0) + 1);
            map.put(bottoms[i], map.getOrDefault(bottoms[i], 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> ele : map.entrySet()) {
            int key  = ele.getKey();
            int val = ele.getValue();

            if(val >= n) {
                int t = changeTops(tops, bottoms, key);
                int b = changeBottoms(tops, bottoms, key);
                if(t != -1 && b != -1) {
                    min = Math.min(min, Math.min(t, b));
                } else if (t != -1) {
                    min = Math.min(min, t);
                } else {
                    min = Math.min(min, b);
                }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
    private int changeTops(int[] tops, int[] bottoms, int key) {
        int count = 0;
        for(int i = 0; i < tops.length; i++) {
            if(tops[i] != key &&  bottoms[i] != key) return -1;
            if(tops[i] == key) continue;
            if(bottoms[i] == key) count++;
        } 

        return count;
    }
    private int changeBottoms(int[] tops, int[] bottoms, int key) {
        int count = 0;
        for(int i = 0; i < tops.length; i++) {
            if(tops[i] != key &&  bottoms[i] != key) return -1;
            if(bottoms[i] == key) continue;
            if(tops[i] == key) count++;
        } 
        return count;
    }
}