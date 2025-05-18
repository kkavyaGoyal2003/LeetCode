class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (String word : words) {
            StringBuilder str =  new StringBuilder();
            str.append(word);
            if (set.contains(str.reverse().toString())) {
                count++;
            }
            set.add(word);
        }

        return count;
    }
}