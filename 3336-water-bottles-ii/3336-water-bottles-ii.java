class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;
        int exchange = numBottles;

        while(exchange >= numExchange) {
            drunk++;
            exchange -= numExchange;
            exchange++; 
            numExchange++;
        }

        return drunk;
    }
}