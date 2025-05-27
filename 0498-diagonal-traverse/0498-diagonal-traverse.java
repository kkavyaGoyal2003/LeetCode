class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];

        int i = 0;
        int j = 0;

        boolean flag = true;
        for(int k = 0; k < m*n; k++) {
            res[k] = mat[i][j]; 
            if(flag) {
                if(j == n-1) {
                    i++;
                    flag = false;
                } else if(i == 0){
                    j++;
                    flag = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if(i == m-1) {
                    j++;
                    flag = true;
                } else if(j == 0){
                    i++;
                    flag = true;
                } else {
                    i++;
                    j--;
                }    
            }
        }
        return res;
    }
}