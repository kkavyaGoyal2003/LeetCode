class Solution {
    class TrieNode {
        TrieNode[] chars;
        boolean isEnd;
        TrieNode() {
            chars = new TrieNode[26];
        }
    }
    private TrieNode root = new TrieNode();
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(curr.chars[c - 'a'] == null) {
                curr.chars[c - 'a'] = new TrieNode();
            }
            curr = curr.chars[c - 'a'];
        }
        curr.isEnd = true;
    }
    
    public String startsWith(String wrds) {
        TrieNode curr = root;
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < wrds.length(); i++) {
            char c = wrds.charAt(i);
            if(curr.chars[c - 'a'] == null) {
                return wrds;
            }
            temp.append(c);
            curr = curr.chars[c - 'a'];
            if(curr.isEnd) return temp.toString();
        }
        return wrds;
    }
    public String replaceWords(List<String> dictionary, String sentence) {
        for(String str : dictionary) {
            insert(str);
        }

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String w : words) {
            startsWith(w);
            ans.append(startsWith(w)).append(" ");
        }

        return ans.toString().trim();
    }
}