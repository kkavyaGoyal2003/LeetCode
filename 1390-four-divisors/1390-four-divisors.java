class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for(int i : nums) {
            int div = calcDivisor(i);
            if(div != -1) ans += div;
        }

        return ans;
        
    }
    private int calcDivisor(int num) {
        int count = 0;

        int sum = 0;
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                int temp = num / i;
                //System.out.println(i + " " + temp);
                if(temp != i) {
                    sum += (i + temp);
                    count += 2;
                } else {
                    sum += i;
                    count += 1;
                }
            }
        }
        //System.out.println(count);
        if(count == 4) return sum;
        return -1;
    }
}