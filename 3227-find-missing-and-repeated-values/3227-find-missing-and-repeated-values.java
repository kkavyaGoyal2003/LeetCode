class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] sol = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        int sum  = 0;
        for(Map.Entry<Integer, Integer> ele: map.entrySet()) {
            int val = ele.getValue();
            sum += ele.getKey();
            if(val == 2) sol[0] = ele.getKey();
        }
        int reqsum = 0;
        if(n*n % 2 == 0) {
            reqsum = ((n*n) / 2) * (n*n + 1);
        } else {
            reqsum = ((n*n + 1) / 2) * (n*n);
        }

        sol[1] = reqsum - sum;

        return sol;
    }
}