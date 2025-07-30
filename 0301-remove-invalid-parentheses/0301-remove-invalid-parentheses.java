class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> sol = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        Queue<String> que = new LinkedList<>();

        que.offer(s);
        boolean flag = false;
        while(!que.isEmpty()) {
            int size = que.size();

            for(int i = 0; i < size; i++) {
                String str = que.poll();
                if(isValid(str)) {
                    sol.add(str);
                    flag = true;
                }
                if(flag) continue;
                for(int j = 0; j < str.length(); j++) {
                    if(s.charAt(j) != '(' && s.charAt(j) != ')') continue;
                    String sub = str.substring(0,j) + str.substring(j+1);
                    if(!set.contains(sub)){
                        que.offer(sub);
                        set.add(sub);
                    }
                }
            }
            if(flag) break;
        }

        return sol;
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