/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    int value = 0;
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        for(Employee e : employees) {
            map.put(e.id, e);
        }

        dfs(map.get(id), map);

        return value;
    }

    public void dfs(Employee e, HashMap<Integer, Employee> map) {

        value += e.importance;
        for(int id : e.subordinates) {
            dfs(map.get(id), map);
        }
    }
}