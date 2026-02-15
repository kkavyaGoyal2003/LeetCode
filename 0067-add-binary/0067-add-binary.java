class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();

        String ans = "";
        int i = len1-1;
        int j = len2-1;
        
        char temp = '0';
        while(i >= 0 && j >= 0) {
            if(a.charAt(i) == '1' && b.charAt(j) == '0') {
                if(temp == '0') {
                    ans = '1' + ans;
                } else {
                    ans = '0' + ans;
                }
            } else if (a.charAt(i) == '0' && b.charAt(j) == '1') {
                if(temp == '0') {
                    ans = '1' + ans;
                } else {
                    ans = '0' + ans;
                }  
            } else if(a.charAt(i) == '1' && b.charAt(j) == '1') {
                if(temp == '0') {
                    ans = '0' + ans;
                    temp = '1';
                } else {
                    ans = '1' + ans;
                    temp = '1';
                }
            } else {
                ans = temp + ans;
                temp = '0';
            }
            i--;
            j--;
            System.out.println(ans + "  " + temp);
        }

        while(i >= 0) {
            if(a.charAt(i) == '0') {
                ans = temp + ans;
                temp = '0';
            } else {
                if(temp == '1') {
                    ans = '0' + ans;
                } else {
                    ans = '1' + ans;
                }
            }
            i--;
            System.out.println(ans + "  " + temp);
        }

        while(j >= 0) {
            if(b.charAt(j) == '0') {
                ans = temp + ans;
                temp = '0';
            } else {
                if(temp == '1') {
                    ans = '0' + ans;
                } else {
                    ans = '1' + ans;
                }
            }
            j--;
            System.out.println(ans + "  " + temp);
        }

        if(temp == '1')ans = temp + ans;
        System.out.println(ans + "  " + temp);
        return ans;
    }
}