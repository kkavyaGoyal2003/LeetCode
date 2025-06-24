/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    private ArrayList<Integer> li;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.li = new ArrayList<>();
        i = 0;
        dfs(nestedList);
    }
    int i ;
    private void dfs(List<NestedInteger> nestedList) {
        for(NestedInteger ele : nestedList) {
            if(ele.isInteger()) {
                li.add(ele.getInteger());
            } else {
                List<NestedInteger> temp = ele.getList();
                dfs(temp);
            }
        }
    }
    @Override
    public Integer next() {
        return li.get(i++);
    }

    @Override
    public boolean hasNext() {
        if(i == li.size()) return false;
        return true;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */