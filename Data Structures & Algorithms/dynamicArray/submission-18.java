class DynamicArray { 
    int[] arr;
    int length, capacity;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        arr = new int[capacity];
    }

    public int get(int i) {
        if(i < length){
            return arr[i];
        }

        return -1;
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
       if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
            if (length > 0) {
            // soft delete the last element
            length--;
        }
        return arr[length];
    }

    private void resize() {
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];
        for(int i = 0; i< arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
      return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
