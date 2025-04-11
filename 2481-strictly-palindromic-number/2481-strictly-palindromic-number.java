/* 
public static String fromBase10(int number, int base) {
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            result.insert(0, remainder); // Insert remainder at the beginning
            number /= base;
        }
        return result.toString();
    }
*/
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i = 2; i < n-1; i++) {
            if(isPalindromic(NBase(n, i))) continue;
            return false;
        }
        return true;
    }
    public String NBase(int number, int base) {
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            result.insert(0, remainder);
            number /= base;
        }
        return result.toString();
    }
    public boolean isPalindromic(String num) {
        int len = num.length();
        int i = 0; 
        int j = len - 1;

        while(i < len / 2) {
            if(num.charAt(i) != num.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}