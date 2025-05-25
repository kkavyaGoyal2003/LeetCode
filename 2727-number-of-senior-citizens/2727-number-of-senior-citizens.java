class Solution {
    public int countSeniors(String[] details) {
        
        int count = 0;
        for(String det : details) {
            StringBuilder s = new StringBuilder();
            s.append(det.charAt(11));
            s.append(det.charAt(12));
            if(Integer.parseInt(s.toString()) > 60) count++;
        }

        return count;
    }
}