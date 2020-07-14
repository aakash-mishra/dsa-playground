public class MaxHeap {

    private static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private static void heapify(int[] heap, int i) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;
        if(left < heap.length && heap[left] > heap[i])
            largest = left;
        if(right < heap.length && heap[right] > heap[largest])
            largest = right;
        if(largest != i) {
            swap(heap, largest, i);
            heapify(heap, largest);
        }
    }

    private static void buildMaxHeap(int[] heap) {
        for(int i = (heap.length)/2 - 1; i >= 0; i--) {
            heapify(heap, i);
        }

    }
    public static void main(String[] args) {
        int[] heap = new int[]{1,2,3,4,5,6};
        buildMaxHeap(heap);
        for(int x : heap) {
            System.out.print(x + " ");
        }
    }
    
}