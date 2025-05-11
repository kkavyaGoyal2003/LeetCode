class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = i+1;

        while(j < n) {
            if(arr[i] % 2 == 0) {
                i++;
                j = i+1;
            } else {
                if( j < n && arr[j] % 2 == 0) {
                    i = j+1;
                    j = i+1;
                } else {
                    if(j-i+1 == 3) return true;
                    j++;
                }
            }
        }

        return false;
    }
}