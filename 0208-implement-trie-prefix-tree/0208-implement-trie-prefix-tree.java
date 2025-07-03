
class Trie {
    class TrieNode {
        TrieNode[] chars;
        boolean isEnd;

        public TrieNode () {
            this.chars =  new TrieNode[26];
        }
    }
    private TrieNode root;
    public Trie() {
        this.root = new TrieNode();
    }
    
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
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(curr.chars[c - 'a'] == null) return false;
            curr = curr.chars[c - 'a'];
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(curr.chars[c - 'a'] == null) return false;
            curr = curr.chars[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */