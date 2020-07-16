public class KSmallestElements {

    public static void main(String[] args) {
        int k = 3;
        MaxHeap heap = new MaxHeap(k);
        int[] arr = new int[]{1,23,12,9,30,2,50};
        for(int i = 0; i < k; i++) {
            heap.insert(arr[i]);
        }
        for(int i = k; i < arr.length; i++) {
            if(arr[i] < heap.heap[0]) {
                heap.heap[0] = arr[i];
                heap.heapify(0);
            }
        }
        System.out.println("K smallest elements are:");
        heap.printMaxHeap();
        
    }
    
}