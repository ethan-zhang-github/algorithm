package priv.ethan.algorithm.sort.solutions;

public class OptimizedBubbleSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        boolean sorted = true;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return arr;
    }

}
