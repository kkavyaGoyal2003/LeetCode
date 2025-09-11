class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        int n = matchsticks.length;

        Arrays.sort(matchsticks);
        for(int i = 0; i < n/2; i++) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[n-1-i];
            matchsticks[n-1-i] = temp;
        }
        for(int i : matchsticks) {
            sum += i;
        }

        if(sum % 4 != 0) return false;
        int s = sum / 4;

        return isPossible(0, s, new int[4], matchsticks);
    }
    private boolean isPossible(int ind, int s, int[] sq, int[] sticks) {

        if(ind == sticks.length) {
            if(sq[0] == s && sq[1] == s && sq[2] == s) return true;
            return false;
        }

        for(int i = 0; i < 4; i++) {
            if(sq[i] + sticks[ind] <= s) {
                sq[i] += sticks[ind];
                if(isPossible(ind+1, s, sq, sticks)) return true;
                sq[i] -= sticks[ind];
            }
        }

        return false;
    }
}