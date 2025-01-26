class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int len = position.length;
        int low = 1;
        int high = position[len - 1];

        while(low <= high) {
            int mid = low + ((high - low) / 2);
            int balls = 1;
            int pos = position[0];

            for(int i = 0; i < len; i++) {
                if(Math.abs(position[i] - pos) >= mid) {
                    pos = position[i];
                    balls++;
                    if(balls == m) break;
                }
            }

            if(balls >= m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}