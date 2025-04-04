class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int x = n;

        while(n != 1) {
            int sum = 0;
            while(x > 0) {
                int rem = x % 10;
                sum += (rem * rem);
                x /= 10;
            }
            if(sum == 1) {
                return true;
            } else {
                if(set.contains(sum)) return false;
                set.add(sum);
            }
            x = sum;
        }
        return true;
    }
}