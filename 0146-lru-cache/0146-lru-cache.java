class LRUCache {
    class ListNode {
        int key;
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
            next = prev = null;
        }
    }
    void removeNode(ListNode node) {
        if (node == head && node == tail) {
            head = tail = null;
        } else if (node == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (node == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.prev = node.next = null; 
    }
    void addLast(ListNode node) {
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    int capacity;
    HashMap<Integer, ListNode> map;
    ListNode head = null;
    ListNode tail = null;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        ListNode node = map.get(key);
        removeNode(node);
        addLast(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            ListNode temp = map.get(key);
            temp.val = value;
            removeNode(temp);
            addLast(temp);
        } else {
            if(map.size() == capacity) {
                ListNode temp = head;
                removeNode(temp);
                map.remove(temp.key);
            }
            ListNode node = new ListNode(key, value);
            map.put(key, node);
            addLast(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */