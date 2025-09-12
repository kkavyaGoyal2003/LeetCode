class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b)->{
            String[] s1 = a.split(" ", 2);
            String[] s2 = b.split(" ", 2);

            boolean d1 = Character.isDigit(s1[1].charAt(0));
            boolean d2 = Character.isDigit(s2[1].charAt(0));

            if(d1 && d2) {
                return 0;
            } else if(!d1 && d2) {
                return -1;
            } else if(d1 && !d2) {
                return 1;
            } else {
                int temp = s1[1].compareTo(s2[1]);
                if(temp == 0) {
                    return s1[0].compareTo(s2[0]);
                } 
                return temp;
            }
            
        });
        return logs;
    }
}