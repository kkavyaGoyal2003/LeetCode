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
                int count = changeTops(tops, bottoms, key);
                System.out.println(min + "   " + count);
                if(count != -1) min = Math.min(min, count);

            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
    private int changeTops(int[] tops, int[] bottoms, int key) {
        int t = 0;
        int b = 0;
        for(int i = 0; i < tops.length; i++) {
            if(tops[i] != key &&  bottoms[i] != key) return -1;
            if(tops[i] == key &&  bottoms[i] == key) continue;
            if(tops[i] == key) b++;
            if(bottoms[i] == key) t++;
        } 
        System.out.println(t + "   " + b);

        return Math.min(t, b);
    }

}