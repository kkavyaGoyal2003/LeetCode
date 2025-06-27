class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return sol;
        HashMap<Integer, String> mobile = new HashMap<>();
        mobile.put(2, "abc");
        mobile.put(3, "def");
        mobile.put(4, "ghi");
        mobile.put(5, "jkl");
        mobile.put(6, "mno");
        mobile.put(7, "pqrs");
        mobile.put(8, "tuv");
        mobile.put(9, "wxyz");

        phnNumber(digits, 0, "", mobile);
        return sol;
    }
    List<String> sol = new ArrayList<>();
    private void phnNumber(String digits, int ind, String ans, HashMap<Integer, String> mobile) {
        if(ind == digits.length()) {
            sol.add(ans);
            return;
        }

        int num = digits.charAt(ind) - '0';
        String s = mobile.get(num);
        for(int i = 0; i < s.length(); i++) {
            phnNumber(digits, ind+1, ans + s.charAt(i), mobile);
        }
    }

}