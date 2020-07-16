public class MaxHeap {
    int[] heap;
    int size;

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public MaxHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {

        if(size == heap.length) {
            throw new IndexOutOfBoundsException("Max limit reached for heap");
        }

        heap[size] = value;
        int index = size;
        while(index > 0 && heap[index] > heap[getParent(index)]) {
            swap(index, getParent(index));
            index = getParent(index);
        }
        this.size++;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public int extractMax() {
        int max = heap[0];
        heap[0] = heap[size - 1];
        heapify(0);
        size--;
        System.out.println("Extracted max value is: " + max);
        return max;
    }

    public void heapify(int i) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;
        if(left < size && heap[left] > heap[i])
            largest = left;
        if(right < size && heap[right] > heap[largest])
            largest = right;
        if(largest != i) {
            swap(largest, i);
            heapify(largest);
        }
    }

    // public static void buildMaxHeap(int[] heap) {
    //     for(int i = (heap.length)/2 - 1; i >= 0; i--) {
    //         heapify(heap, i, heap.length);
    //     }
    // }

    public void printMaxHeap() {
        for(int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        int[] arr = new int[]{1,23,12,9,30,2,50};
        for(int x : arr) {
            heap.insert(x);
        }
        System.out.println("Max heap array is:");
        heap.printMaxHeap();
        heap.extractMax();
        heap.printMaxHeap();
        heap.extractMax();
        heap.printMaxHeap();
    }
    
}