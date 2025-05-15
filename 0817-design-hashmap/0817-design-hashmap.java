class MyHashMap {

    private Node[] arr;
    private int len;
    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    public MyHashMap() {
        len = 10000;
        this.arr =  new Node[len];
    }

    int hash(int key) {
        return key % len;
    }
    

    Node helper(Node head, int key) {
        Node prev = null;
        Node curr = head;

        while(curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }

        return prev;
    }
    public void put(int key, int value) {
        int index = hash(key);
        if(arr[index] == null) {
            arr[index] = new Node(-1, -1);
        }
        Node temp = helper(arr[index], key);
        if(temp.next == null) {
            Node node = new Node(key, value);
            temp.next = node;
        } else {
            temp.next.value = value;
        }    
    }
    
    public int get(int key) {
        int index = hash(key);
        if(arr[index] == null) {
            return -1;
        }

        Node temp = helper(arr[index], key);
        if(temp.next == null) {
            return -1;
        }

        return temp.next.value;
    }
    
    public void remove(int key) {
        int index = hash(key);
        if(arr[index] == null) {
            return;
        }

        Node temp = helper(arr[index], key);
        if(temp.next == null) {
            return;
        }

        Node node = temp.next;
        temp.next = temp.next.next;
        node.next = null;
    
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */