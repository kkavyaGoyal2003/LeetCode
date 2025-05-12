class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int ind_G = -1, ind_P= -1, ind_M = -1;

        for(int i = 0; i < n; i++) {
            String s = garbage[i];
            if(s.contains("G")) ind_G = i; 
            if(s.contains("P")) ind_P = i;
            if(s.contains("M")) ind_M = i;
        }

        int time_G = 0, time_P = 0, time_M = 0;
        for(int i = 0; i < n - 1; i++) {
            if(i <  ind_G) time_G += travel[i];
            if(i <  ind_M) time_M += travel[i];
            if(i <  ind_P) time_P += travel[i];
        }
        
        for(String s : garbage) {
            for(char c : s.toCharArray()) {
                if(c == 'M') time_M++;
                if(c == 'P') time_P++;
                if(c == 'G') time_G++;
            }
        }

        return time_M + time_G + time_P;
    }
}