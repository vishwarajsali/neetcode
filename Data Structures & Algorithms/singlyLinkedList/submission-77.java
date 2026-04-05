


class LinkedList {

   
     private List<Integer> list;

    public LinkedList() {
        list = new ArrayList<>();
    }

    public int get(int i) {
        if (i < 0 || i >= list.size()) {
            return -1;
        }
        return list.get(i);
    }

    public void insertHead(int val) {
        list.add(0, val); // Insert at index 0
    }

    public void insertTail(int val) {
        list.add(val); // Add at end
    }

    public boolean remove(int i) {
        if (i < 0 || i >= list.size()) {
            return false;
        }
        list.remove(i); // Remove by index
        return true;
    }


    public ArrayList<Integer> getValues() {
        return (ArrayList<Integer>) list;
    }
}
