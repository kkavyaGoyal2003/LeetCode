class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> table = new HashMap<>();
        table.put('a', ".-"); table.put('b', "-..."); table.put('c', "-.-.");
        table.put('d', "-.."); table.put('e', "."); table.put('f', "..-.");
        table.put('g', "--."); table.put('h', "...."); table.put('i', "..");
        table.put('j', ".---"); table.put('k', "-.-"); table.put('l', ".-.."); 
        table.put('m', "--"); table.put('n', "-."); table.put('o', "---");
        table.put('p', ".--."); table.put('q', "--.-"); table.put('r', ".-.");
        table.put('s', "..."); table.put('t', "-"); table.put('u', "..-");
        table.put('v', "...-"); table.put('w', ".--"); table.put('x', "-..-");
        table.put('y', "-.--"); table.put('z', "--..");

        HashSet<String> set = new HashSet<>();
        for(String s : words) {
            StringBuilder str = new StringBuilder();
            for(char c : s.toCharArray()) {
                str.append(table.get(c));
            }
            set.add(str.toString());
        }
        return set.size();
    }
}