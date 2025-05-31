class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for(char c :s.toCharArray()) {
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') 
            || (c >= '0' && c <= '9')) str.append(Character.toLowerCase(c));
        }

        int len = str.length();
        for(int i = 0; i < len/2 ; i++) {
            if(str.charAt(i) != str.charAt(len-1-i)) return false;
        }

        return true;
    }
}