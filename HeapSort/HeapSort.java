class HeapSort {
    int arr[];
    public static void main(String[] args) {
        HeapSort heapsort=new HeapSort();
        heapsort.arr = new int[]{ 10,20,15,12,25,40};
        heapsort.sortArray();
        heapsort.printArray();
    }
    private int[] sortArray() {
        MaxHeapUsingArray maxHeapUsingArray = new MaxHeapUsingArray(arr.length);
        for (int i = 0; i < arr.length; i++) {
            try {
                maxHeapUsingArray.insert(arr[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            try {
                arr[i] = maxHeapUsingArray.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arr;
    }
    private void printArray(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
