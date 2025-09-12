class Solution {
    public int myAtoi(String s) {
        String str = s.trim();
        int sign = 1;
        long num = 0;

        int n = str.length();
        if(n == 0) return 0;
        
        if(str.charAt(0) == '-') sign = -1;
        for(int i = 0; i < n; i++) {
            if(i == 0 &&( str.charAt(0) == '-' ||  str.charAt(0) == '+')) continue;
            char c = str.charAt(i);
            if(!Character.isDigit(c)) break;
            num = num*10 + (long)(c - '0');
            if(num > Integer.MAX_VALUE) {
                if(sign == -1) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            System.out.println(num);
        } 

        num = sign * num;
        // if(num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        // if(num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int)(num);
    }
}