class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int count = 0;
            int sum = 0;
            while(count < Math.abs(k)) {
                sum += code[(i+count) % n];
                count++;
            }
            map.put(i, sum);
            count = 0;
            sum = 0;
        }

        int[] decrypt = new int[n];
        if(k == 0) return decrypt;

        if(k > 0) {
            for(int i = 0; i < n; i++) {
                decrypt[i] = map.get((i + 1) % n);
            }
        } 
        if(k < 0) {
            for(int i = 0; i < n; i++) {
                decrypt[i] = map.get((n - Math.abs(k) + i) % n);
            }
        }

        return decrypt;
    }
}