class LRUCache {

    class Node{
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private int cacheCapacity;
    private Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        cacheCapacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);

        // move node to front
        node.prev.next = node.next;
        node.next.prev = node.prev;

        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;

        return node.value;
    }
    
    public void put(int key, int value) {
        
        if (map.containsKey(key)) {
            // update value
            Node node = map.get(key);
            node.value = value;

            // remove from current position
            node.prev.next = node.next;
            node.next.prev = node.prev;

            // move to front
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;

        } else {
            // check capacity
            if (map.size() == cacheCapacity) {
                // remove LRU (node before tail)
                Node lru = tail.prev;
                lru.prev.next = tail;
                tail.prev = lru.prev;

                map.remove(lru.key);
            }

            // create new node
            Node node = new Node(key, value);

            // insert at front
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;

            map.put(key, node);
        }

    }
}











