package priv.ethan.algorithm.sort.solutions;

public class HeapSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        buildHeap(arr, len - 1);
        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            shiftDown(arr, i - 1, 0);
        }
        return arr;
    }

    private void buildHeap(int[] arr, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {
            shiftDown(arr, n, i);
        }
    }

    private void shiftDown(int[] arr, int n, int i) {
        int temp = arr[i];
        int maxIndex = i;
        while (true) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            if (l <= n && arr[l] > temp) {
                maxIndex = l;
            }
            if (r <= n && arr[r] > temp && arr[r] > arr[l]) {
                maxIndex = r;
            }
            if (maxIndex == i) {
                break;
            }
            arr[i] = arr[maxIndex];
            i = maxIndex;
        }
        arr[maxIndex] = temp;
    }

}
