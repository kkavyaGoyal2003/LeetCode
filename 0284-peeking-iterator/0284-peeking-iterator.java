// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    List<Integer> li;
    int index;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        li = new ArrayList<>();
        index = 0;

        while(iterator.hasNext()) {
            li.add(iterator.next());
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return li.get(index);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int ans = li.get(index);
        index++;
        return ans;
	}
	
	@Override
	public boolean hasNext() {
	    if(index == li.size()) return false;
        return true;
	}
}