class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if(index < 0 || index > size) return -1;
        Node dummy = head;
        while(index-- > 0) dummy = dummy.next;
        return dummy == null ? -1 : dummy.val;
    }

    public void insertHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void insertTail(int val) {
        Node node = new Node(val);
        if(isEmpty()){
            head = node;
            size++;
            return;
        }
        Node dummy = head;
        while(dummy.next != null) dummy = dummy.next;
        dummy.next = node;
        size++;
    }

    public boolean remove(int index) {
        if(index >= size || index < 0) return false;
        Node current = head;
        Node previous = null;
        while(index-- > 0){
            previous = current;
            current = current.next;
        }
        if(previous == null)head = head.next;
        else previous.next = current.next;
        size--;
        return true;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> values = new ArrayList<>();
        Node dummy = head;
        while(dummy != null){
            values.add(dummy.val);
            dummy = dummy.next;
        }
        return values;
    }

    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
}
