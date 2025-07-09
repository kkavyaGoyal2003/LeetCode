class Solution {
    class TrieNode {
        TrieNode[] chars;
        boolean isEnd;

        public TrieNode () {
            this.chars = new TrieNode[26];
        }
    }

    public void insert(TrieNode root, String word) {
        TrieNode curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.chars[c - 'a'] == null) {
                curr.chars[c - 'a'] = new TrieNode();
            }
            curr = curr.chars[c - 'a'];
        }
        curr.isEnd = true;
    }

    String sol = "";

    public String longestWord(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            insert(root, word);
        }

        StringBuilder s = new StringBuilder();
        helper(root, s);
        return sol;
    }

    private void helper(TrieNode curr, StringBuilder s) {
        if (curr != null && !curr.isEnd && s.length() != 0) return;

        if (s.length() > sol.length()) {
            sol = s.toString();
        }

        for (int i = 0; i < 26; i++) {
            if (curr.chars[i] != null) {
                s.append((char) ('a' + i));
                helper(curr.chars[i], s);
                s.deleteCharAt(s.length() - 1);
            }
        }
    }
}
