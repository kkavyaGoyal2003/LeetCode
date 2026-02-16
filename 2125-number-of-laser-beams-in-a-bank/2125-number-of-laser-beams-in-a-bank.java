class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(String beam: bank) {
            int len = beam.length();
            int sum = 0;
            for(int i = 0; i < len; i++) {
                if(beam.charAt(i) == '1') sum++;
                //System.out.println(beam + "   "+ sum);
            }
            if(sum != 0)list.add(sum);
            System.out.print(list);
        }

        for(int i = 1; i < list.size(); i++) {
            count += list.get(i-1)*list.get(i);
        }
        
        return count;
    }
}