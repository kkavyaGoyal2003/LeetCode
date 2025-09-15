class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < brokenLetters.length(); i++) {
            char c = brokenLetters.charAt(i);
            set.add(c);
        }

        int count = 0;
        String[] str = text.split(" ");
        for(String s: str) {
            boolean flag = true;
            for(int i = 0; i < s.length(); i++) {
                if(set.contains(s.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }

        return count;
    }
}