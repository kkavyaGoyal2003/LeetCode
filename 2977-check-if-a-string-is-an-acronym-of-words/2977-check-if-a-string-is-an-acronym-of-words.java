class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder str = new StringBuilder();

        for(String ch : words) {
            str.append(ch.charAt(0));
        }

        return s.equals(str.toString());
    }
}