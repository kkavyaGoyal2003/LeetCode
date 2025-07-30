class Solution {
    public List<String> removeInvalidParentheses(String s) {
        if(s.length() == 0) return new ArrayList<>();
        List<String> sol = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Queue<String> que = new LinkedList<>();
        this.flag = false;
        this.max = 0;

        dfs(s, set, sol);
        if(sol.size() == 0) sol.add("");

        return sol;

    }
    private boolean flag;
    private int max;
    private void dfs(String s, HashSet<String> set, List<String> sol) {

        if(s.length() < max) return;
        set.add(s);
        if(isValid(s)) {
            flag = true;
            if (s.length() > max) {
                max = s.length();
                sol.clear();
            }
            sol.add(s);
        } else {
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) != '(' && s.charAt(j) != ')') continue;
                String sub = s.substring(0,j) + s.substring(j+1);
                if(!set.contains(sub)){
                    dfs(sub, set, sol);
                }
            }
        }
    }
    private boolean isValid(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') count++;
            else if(c == ')') {
                count--;
                if(count < 0) return false;
            }
        }
        return count == 0;
    }
}