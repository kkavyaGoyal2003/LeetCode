class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = n - 1;
        if(m == 1 && n == 1) return new int[] {0, 0};
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            int max = 0;
            int index = -1;
            for(int i = 0; i < m; i++) {
                if(max < mat[i][mid]) {
                    max = mat[i][mid];
                    index = i;
                }
            }

            if(mid == 0 && max > mat[index][mid + 1]) return new int[] {index, mid};
            if(mid == n - 1 && max > mat[index][mid - 1]) return new int[] {index, mid};
            if(max > mat[index][mid + 1] && max > mat[index][mid - 1] ) return new int [] {index, mid};
            
            if(mid > 0 && max < mat[index][mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return new int[] { };
    }
}
