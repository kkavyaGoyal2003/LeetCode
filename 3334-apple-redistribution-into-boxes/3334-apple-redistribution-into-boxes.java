class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n = apple.length;
        int m = capacity.length;

        int totalApples = 0;

        for(int app : apple) {
            totalApples += app;
        }

        Arrays.sort(capacity);

        int box = 0;
        for(int i = m - 1; i >= 0; i--) {
            totalApples -= capacity[i];
            box++;
            if(totalApples <= 0) {
                break;
            }
        }

        return box;
    }
}