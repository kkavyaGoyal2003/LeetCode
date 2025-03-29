class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int n = properties.length;
        
        Arrays.sort(properties, (a,b)-> {
            if(a[0] != b[0]) {
                return b[0]-a[0];
            } else {
                return a[1]-b[1];
            }
        });

        int count = 0;
        int max  = 0;
        for(int i = 0; i < n; i++) {
            if(properties[i][1] < max) {
                count++;
            } else {
                max = properties[i][1];
            }
            
        }

        return count;
    }
}