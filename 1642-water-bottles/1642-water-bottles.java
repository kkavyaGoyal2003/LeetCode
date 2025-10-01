class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int left = numBottles;
        int bottle = numBottles;

        while(left >= numExchange) {
            int temp = left / numExchange;
            bottle += temp;
            left = temp + (left % numExchange);
        }

        return bottle;
    }
}