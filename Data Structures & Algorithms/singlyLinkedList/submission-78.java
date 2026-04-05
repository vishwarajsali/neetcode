class LinkedList {

    private ListNode head ;
    private int length;

    public LinkedList() {
        this.length = 0;
        head = null;
    }

    public int get(int index) {
        if(index < 0 || index > length) return -1;
        ListNode dummy = head;

        while(index-- > 0) dummy = dummy.next;
        return dummy != null ? dummy.val : -1;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        
        node.next = head;
        head = node;
        length++;
    }

    public void insertTail(int val) {
        ListNode node = new ListNode(val);
        if(isEmpty()) {
            head = node;
            length++;
            return;
        }
        ListNode dummy = head;
        while(dummy.next != null) dummy = dummy.next;
        dummy.next = node;
        length++;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= length) {
            return false;
        }
        ListNode current = head;
        ListNode previous = null;

        while(index-- > 0) {
            previous = current;
            current = current.next;
        }

        if(previous == null) head = head.next;
        else previous.next = current.next;
        length--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode dummy = head;
        
        while(dummy != null){
            list.add(dummy.val);
            dummy = dummy.next;
        }
        
        return list;

    }
}
class ListNode {

    public int val;
    public ListNode next;

    public ListNode(){}


    public ListNode(int val) {this.val = val;
    next = null;
    }

}
