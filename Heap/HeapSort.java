public class HeapSort {
    private static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public static void main(String[] args) {
        int[] heap = new int[]{5,8,7,3,6,2,4};
        int n = heap.length - 1;
        MaxHeap.buildMaxHeap(heap);
        while(n >= 0) {
            swap(heap, 0, n);
            MaxHeap.heapify(heap, 0, n);
            n--;
        }
        System.out.println("Sorted array is:");
        for(int x : heap) {
            System.out.print(x + " ");
        }
    }
}