class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer, int[]> map = new HashMap<>(); 
        int m = mat.length; // 2
        int n = mat[0].length; // 3
        int len = arr.length;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                map.put(mat[i][j], new int[] {i, j});
            }
        }

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i = 0; i < len; i++) {
            int[] index = map.get(arr[i]);
            row[index[0]]++;
            col[index[1]]++;

            if(row[index[0]] == n||col[index[1]] == m) return i;
        }

        return -1;
    }
}