class Solution {
    public boolean isMatch(String s, String p) {
        int lens = s.length();
        int lenp = p.length();

        int pp = 0;
        int sp = 0;
        int pstar = -1;
        int sstar = -1;

        while(sp < lens) {
            if(pp < lenp && (s.charAt(sp) == p.charAt(pp) || p.charAt(pp) == '?')) {
                pp++;
                sp++;
            } else if(pp < lenp  && p.charAt(pp) == '*') {
                pstar = pp;
                sstar = sp;
                pp++;
            } else if(pstar == -1) {
                return false;
            } else {
                sstar = sstar + 1;
                sp = sstar;
                pp = pstar + 1; 
            }
        }
        while(pp < p.length()){
            if(p.charAt(pp) != '*') return false;
            pp++;
        }

        return true;
    }
}