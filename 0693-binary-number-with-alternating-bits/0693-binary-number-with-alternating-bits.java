class Solution {
    public boolean hasAlternatingBits(int n) {
        int check = -1;
        int num = n;
        while(num != 1) {
            int rem = num % 2;
            if(check != 11) {
                if(check == rem) return false;
            } 
            //System.out.println(check);
            check = rem;
            num /= 2;
            //System.out.println(rem +"  "+num);
        }
        if(check == num) return false;
        return true;
    }
}