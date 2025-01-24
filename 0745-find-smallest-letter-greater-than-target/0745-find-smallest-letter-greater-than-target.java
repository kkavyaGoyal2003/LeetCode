class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0; // 0
        int high = letters.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(letters[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } 
        if(low == letters.length) low = 0;
        return letters[low];
    }
}