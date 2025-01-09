class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            boolean flag = true;
            String wrd = words[i];
            if(len > wrd.length()) continue;
            for(int j = 0; j < len; j++) {
                if(pref.charAt(j) != wrd.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;   
    }
}