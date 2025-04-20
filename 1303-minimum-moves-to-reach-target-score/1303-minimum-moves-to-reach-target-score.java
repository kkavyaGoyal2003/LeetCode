class Solution {
    public int minMoves(int target, int maxDoubles) {
        int num = target;
        int count = 0;

        while(num > 1) {
            if(maxDoubles == 0) {
                count += (num - 1);
                break;
            }
            if(num % 2 == 0 && maxDoubles > 0) {
                num /= 2;
                maxDoubles--;
            } else {
                num--;
            }
            count++;
        }

        return count;
    }
}