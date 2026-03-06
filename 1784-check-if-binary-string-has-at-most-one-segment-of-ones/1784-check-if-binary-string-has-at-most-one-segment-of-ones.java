class Solution {
    public boolean checkOnesSegment(String s) {
        int len = s.length();
        int pos=0;
        for(int i=0; i<len; i++){
            char bit = s.charAt(i);
            if(bit=='1'){                
                if(i-pos>1) return false;
                pos=i;
            }
        }
        return true;
    }
}