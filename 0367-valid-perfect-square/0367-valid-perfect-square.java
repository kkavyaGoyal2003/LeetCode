class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int low = 1; 
        int high = num / 2;

        while(low <= high) {
            int mid = low + ((high - low) / 2);
            if((long)mid * mid == num) return true;
            if((long)mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}