class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        listPalidromes(s, 0, new ArrayList<>());
        return result;
    }
    private void listPalidromes(String s, int i, List<String>temp)  {
        if(i >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int j = i; j < s.length(); j++) {
            if(isPalindrome(s, i, j)) {
                temp.add(s.substring(i, j+1));
                listPalidromes(s, j+1, temp);
                temp.remove(temp.size()-1);
            }
        }

    }
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}