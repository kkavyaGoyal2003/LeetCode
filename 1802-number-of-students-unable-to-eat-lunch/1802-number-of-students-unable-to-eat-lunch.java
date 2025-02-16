class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = sandwiches.length;
        Queue<Integer> people = new LinkedList<>();

        for(int st: students) {
            people.offer(st);
        }

        int count = 0;
        int i = 0;
        while(!people.isEmpty()) {
            if(people.peek() == sandwiches[i]) {
                people.poll();
                i++;
                count = 0;
            } else {
                people.offer(people.poll());
                count++;
            }
            if(count == people.size()) break;
        }

        return people.size();
     }
}