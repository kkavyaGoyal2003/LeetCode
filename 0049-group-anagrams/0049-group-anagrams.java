class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result =  new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String wrd : strs) {
            char[] chars = wrd.toCharArray();
            Arrays.sort(chars);

            String str = new String(chars);
            if(!map.containsKey(str)) map.put(str, new ArrayList<>());           

            map.get(str).add(wrd);
        }

        for(List<String> list : map.values()) {
            result.add(list);
        }

        return result;
    }
}