class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] open = new int[n+1];
        int[] closed = new int[n+1];

        for (int i = 1; i <= n; i++) {
            closed[i] = closed[i - 1];
            if (customers.charAt(i - 1) == 'N') {
                closed[i]++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            open[i] = open[i + 1];
            if (customers.charAt(i) == 'Y') {
                open[i]++;
            }
        }


        int hour = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= n; i++) {
            if(min > open[i]+ closed[i]) {
                min = open[i]+ closed[i];
                hour = i;
            }
        }

        return hour;
    }
}