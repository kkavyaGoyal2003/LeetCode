class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int maxContainers = n * n;
        int totalWeight = maxContainers* w;

        while(totalWeight > maxWeight) {
            totalWeight -= w;
            maxContainers--;
        } 

        return maxContainers;
    }
}