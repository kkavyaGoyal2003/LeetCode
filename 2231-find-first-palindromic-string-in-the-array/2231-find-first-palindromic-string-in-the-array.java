class Solution {
    public String firstPalindrome(String[] words) {
        int len = words.length;
        
        for(String str : words) {
            int n = str.length();
            boolean flag = true;
            for(int i = 0; i < n / 2; i++) {
                if(str.charAt(i) != str.charAt(n-1-i)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return str;
            }
        }
        
        return "";
    }
}