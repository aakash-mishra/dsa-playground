import java.util.Arrays;

public class QuickSort {

    private static void quickSort(int[] a, int l, int r) {
        if(l < r) {
            int partition = partition(a, l, r);
            quickSort(a, l, partition - 1);
            quickSort(a, partition + 1, r);
        }
    }

    private static int partition(int[] a, int l, int r) {
        //choose first element as pivot
        int pivot = a[r];
        int pIndex = l;
        for(int i = l; i < r; i++) {
            if(a[i] <= pivot) {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
        swap(a, r, pIndex);
        return pIndex;    
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int[] a = {6,2,3,1,5,8,10};
        //let pivot be the first element of arr
        //swap elements to the right of pivot such that, all elements smaller than pivot are to the left
        //of pivot and elements greater (or eq) are to the right of pivot
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }
    
}
