class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();

        for(List<String> li : paths) {
            set.add(li.get(0));
        }

        for(List<String> li : paths) {
            if(!set.contains(li.get(1))) return li.get(1);
        }
        return "";
    }
}