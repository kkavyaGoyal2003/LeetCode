class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int num = 0;
        int i = 0;
        while(n >= num) {
            num = (int)Math.pow(2, i);
            i++;
        }
        //System.out.println(num);
        return Math.abs(n - (num-1));
    }
}