class Solution {
    public String convertDateToBinary(String date) {
        int len = date.length();
        String regex = "-";
        String [] numbers = date.split(regex);

        for(int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            int count = 0;
            long bnum = 0;
            while(num != 0) {
                int rem = num % 2;
                bnum = bnum + (long)(rem * Math.pow(10, count));
                num /= 2;
                count++;
            }
            numbers[i] = Long.toString(bnum);
        }

        String ans = String.join("-", numbers);
        return ans;
    }
}