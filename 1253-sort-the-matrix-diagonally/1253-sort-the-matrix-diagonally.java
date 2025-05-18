
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for (int j = 0; j < n; j++) {
            List<Integer> diagonal = new ArrayList<>();
            int x = 0, y = j;
            
            while (x < m && y < n) {
                diagonal.add(mat[x][y]);
                x++;
                y++;
            }
            
            Collections.sort(diagonal);

            x = 0;
            y = j;
            int index = 0;
            while (x < m && y < n) {
                mat[x][y] = diagonal.get(index++);
                x++;
                y++;
            }
        }

        for (int i = 1; i < m; i++) {
            List<Integer> diagonal = new ArrayList<>();
            int x = i, y = 0;
            
            while (x < m && y < n) {
                diagonal.add(mat[x][y]);
                x++;
                y++;
            }
            
            Collections.sort(diagonal);

            x = i;
            y = 0;
            int index = 0;
            while (x < m && y < n) {
                mat[x][y] = diagonal.get(index++);
                x++;
                y++;
            }
        }

        return mat;
    }
}


