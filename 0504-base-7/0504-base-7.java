class Solution {
    public String convertToBase7(int num) {
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        if(num < 0) {
            num = (-1) * num;
            flag = true;
        }

        while(num >= 7) {
            int rem =  num % 7;
            str.append((char) ('0' + rem));
            num /= 7;
        }
        str.append((char) ('0' + num));
        if(flag) str.append('-');

        return str.reverse().toString();
    }
}