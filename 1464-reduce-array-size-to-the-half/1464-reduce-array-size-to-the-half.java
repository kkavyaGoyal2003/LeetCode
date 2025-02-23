class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq, Collections.reverseOrder());

        int remove = 0;
        int size = 0;

        for(int i  : freq)  {
            remove += i;
            size++;
            if(remove >= n / 2) break;
        }     

        return size;
    }
}