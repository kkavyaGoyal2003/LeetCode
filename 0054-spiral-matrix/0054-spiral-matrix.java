class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        ArrayList<Integer> list = new ArrayList<>();

        while(top < bottom+1 && left < right+1) {

            for(int i = left; i < right+1; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i < bottom+1; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(top < bottom+1) {
                for(int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left < right+1) {
                for(int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}