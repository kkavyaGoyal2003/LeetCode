class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();
        
        for(String op : operations) {
            if(isInteger(op)) {
                score.push(Integer.parseInt(op));
            } else if(op.equals("+")) {
                int top1 = score.pop();
                int top2 = score.pop();
                score.push(top2);
                score.push(top1);
                score.push(top2 + top1);
            } else if(op.equals("D")){
                score.push(2 * score.peek());
            } else if (op.equals("C")) {
                if(!score.isEmpty())score.pop();
            }
        }

        int totalScore = 0;
        while(!score.isEmpty()) {
            totalScore += score.pop();
        }

        return totalScore;
    }
    public static boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }
}