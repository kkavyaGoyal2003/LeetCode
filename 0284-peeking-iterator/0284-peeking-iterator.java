// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer ele;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.itr = iterator;
        ele = itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return ele;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int val = ele;
        if(itr.hasNext()) ele = itr.next();
        else ele = null;
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    if(ele == null) return false;
        return true;
	}
}