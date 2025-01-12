class Solution {
    public int mostWordsFound(String[] sentences) {
       int len = sentences.length;
       int max = 0;

       for(String str : sentences) {
            int count = 1;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ' ') count++;
            } 
            if(max < count) max = count;
       } 

       return max;
    }
}