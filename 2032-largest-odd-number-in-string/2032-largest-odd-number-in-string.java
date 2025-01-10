class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        int index = -1;
        for(int i = len - 1; i >= 0; i--) {
            int no = num.charAt(i) - '0';
            if(no % 2 != 0) {
              index = i;
              break;  
            }
        }   

        return num.substring(0, index+1);
    }
}