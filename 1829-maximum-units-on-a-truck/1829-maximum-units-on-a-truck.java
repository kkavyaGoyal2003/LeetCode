class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[1], a[1]);
            }
        }); 

        int total = 0;
        int size = truckSize;
        for(int[] box: boxTypes) {
            if(size == 0) break;
            if(box[0] >= size) {
                total += (size * box[1]);
                break;
            } else {
                total += (box[0] * box[1]);
                size -= box[0];
            }
        }
        return total;
    }
}