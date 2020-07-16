public class HeapSort {
    
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(7);
        int[] arr = new int[]{5,8,7,3,6,2,4};
        for(int x : arr) {
            heap.insert(x);
        }
        System.out.println("Max heap array is: ");
        heap.printMaxHeap();
        int originalSize = heap.size;
        while(heap.size > 0) {
            heap.swap(0, heap.size - 1);
            heap.size--;
            heap.heapify(0);
        }
        heap.size = originalSize;
        System.out.println("Sorted array is:");
        heap.printMaxHeap();
    }
}