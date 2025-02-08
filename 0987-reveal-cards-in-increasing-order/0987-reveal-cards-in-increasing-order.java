class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int [] result = new int[n];
        Queue<Integer> que = new LinkedList<>();

        Arrays.sort(deck);
        for(int i = 0; i < n; i++) {
            que.offer(i);
        }

        for(int i = 0; i < n; i++) {
            int j = que.poll();
            result[j] = deck[i];
            if(!que.isEmpty()) {
                int card = que.poll();
                que.offer(card);
            }
        }
        return result;
    }
}