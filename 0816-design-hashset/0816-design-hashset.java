class MyHashSet {
    private boolean[][] arr;
    private int len;
    public MyHashSet() {
        len = 1000;
        arr = new boolean[len][];
    }
    private int hash1(int key) {
        return key % 1000;
    }
    private int hash2(int key) {
        return key / 1000;
    }
    public void add(int key) {
        int index = hash1(key);
        if(arr[index] == null) {
            if(index == 0) {
                arr[index] = new boolean[len +1];
            } else {
                arr[index] = new boolean[len];
            }
        }
        arr[index][hash2(key)] = true;
    }
    
    public void remove(int key) {
        int index = hash1(key);
        if(arr[index] == null) {
            return;
        } 
        arr[index][hash2(key)] = false;

    }
    
    public boolean contains(int key) {
        int index = hash1(key);
        if(arr[index] == null) {
            return false;
        } 
        return arr[index][hash2(key)];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */