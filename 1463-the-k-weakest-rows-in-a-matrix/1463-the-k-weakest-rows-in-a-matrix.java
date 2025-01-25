class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer,Integer> soldier = new HashMap<>();

        for(int i = 0; i < m; i++) {
            soldier.put(i, countSoldiers(mat, i, n));
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(soldier.entrySet());
        list.sort(Map.Entry.comparingByValue());
        
        int[] sol = new int [k];

        for(int i = 0; i < k; i++) {
            sol[i] = list.get(i).getKey();
        }

        return sol;
    }
    public int countSoldiers(int[][] mat , int r, int n) {
        int low = 0;
        int high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(mat[r][mid] == 0){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high + 1;
    }
}