class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int bucket = capacity;
        int steps = 0;

        for(int i = 0; i < n; i++) {
            if(bucket >= plants[i]) {
                bucket -= plants[i];
                steps++;
            } else {
                steps += (2 * i);
                bucket = capacity;
                steps++;
                bucket -= plants[i];
            }
        }

        return steps;
    }
}