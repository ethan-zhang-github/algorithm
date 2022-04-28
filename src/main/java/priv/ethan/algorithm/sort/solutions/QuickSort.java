package priv.ethan.algorithm.sort.solutions;

public class QuickSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int cursor = l;
        for (int i = l; i < r; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, cursor);
                cursor++;
            }
        }
        swap(arr, cursor, r);
        return cursor;
    }

}
