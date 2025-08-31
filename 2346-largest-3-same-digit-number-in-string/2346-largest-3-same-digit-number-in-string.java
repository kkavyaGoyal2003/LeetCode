class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        int max = -1;
        for(int i = 0; i < n-2; i++) {
            String sb = num.substring(i, i+3);
            if(checkSame(sb)) {
                int no = Integer.parseInt(sb);
                max = Math.max(max, no);
            }
        }

        if(max == -1) return "";
        if(max == 0) return "000";
        return  String.valueOf(max);
    }
    private boolean checkSame(String sb) {
        for(int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i-1) != sb.charAt(i)) return false;
        }

        return true;
    }
}