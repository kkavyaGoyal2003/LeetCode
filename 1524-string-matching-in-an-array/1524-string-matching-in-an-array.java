class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> match = new ArrayList<>();
        int n = words.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && words[i].contains(words[j])) {
                    if(match.contains(words[j])) continue;
                    match.add(words[j]);
                }
            }
        }
        return match;
    }
}