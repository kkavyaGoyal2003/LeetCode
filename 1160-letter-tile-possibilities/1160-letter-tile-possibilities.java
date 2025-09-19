class Solution {
    HashSet<String> set = new HashSet<>();
    public int numTilePossibilities(String tiles) {
        char[] tilesArray = tiles.toCharArray();
        Arrays.sort(tilesArray);
        tiles = new String(tilesArray);
        makeString(tiles, new boolean[tiles.length()], "");
        return set.size();
    }

    private void makeString(String tiles, boolean[] used, String current) {
        if (!current.isEmpty()) set.add(current);

        for (int i = 0; i < tiles.length(); i++) {
            if (used[i] || (i > 0 && tiles.charAt(i) == tiles.charAt(i - 1) && !used[i - 1])) continue;
            used[i] = true;
            makeString(tiles, used, current + tiles.charAt(i));
            used[i] = false;
        }
    }
}