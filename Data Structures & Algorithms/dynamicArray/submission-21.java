    class DynamicArray {

    private int[] arr;
    private int capacity;
    private int length;
  public DynamicArray(int capacity) {
        this.length = 0;
        this.capacity = capacity;
        // if(this.capacity <= 0) throw new IllegalArgumentException("Capacity of the array should be > 0, But its : "+ this.capacity);
        this.arr = new int[this.capacity];
    }


    /*
    *
    * int get(int i) will return the element at index i. Assume that index i is valid.
    * */
    public int get(int i) {
        return this.arr[i];
    }
    /*
    *
    * void set(int i, int n) will set the element at index i to n. Assume that index i is valid.
    * */
    public void set(int i, int n) {
        this.arr[i] = n;
    }

    /*
    * void pushback(int n) will push the element n to the end of the array.
    * If we call void pushback(int n) but the array is full, we should resize the array first.
     * */
    public void pushback(int n) {
        if(length == capacity) resize();
        arr[length] = n;
        length++;
    }

    /*
    * int popback() will pop and return the element at the end of the array. Assume that the array is non-empty.
    * */
    public int popback() {
        if(length > 0){
            length --;
        }
        return arr[length];
    }


    /*
    * void resize() will double the capacity of the array.
    * */
    private void resize() {
        this.capacity *= 2;
        int[] newArray = new int[capacity];
        for(int i = 0; i < length;i++){
            newArray[i] = arr[i];
        }
        arr = newArray;
    }

    /*
    * int getSize() will return the number of elements in the array.
    *
    * */
    public int getSize() {
        return length;

    }

    /*
    * int getCapacity() will return the capacity of the array.
    *
    * */
    public int getCapacity() {
        return capacity;

    }
    }
