class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] sol = new String[arr.length];

        for(String str : arr) {

            int len = str.length();
            int n = str.charAt(len - 1) - '0';

            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < len - 1; i++) {
                ans.append(str.charAt(i));
            }

            sol[n-1] = ans.toString();
        }

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < sol.length; i++) {

            ans.append(sol[i]);
            if(i ==  sol.length - 1) continue;

            ans.append(" ");
        }
        
        return ans.toString();
    }
}