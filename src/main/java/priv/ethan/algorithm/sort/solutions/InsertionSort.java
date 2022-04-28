package priv.ethan.algorithm.sort.solutions;

public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int temp = arr[i];
            int flag = i;
            for (int j = i - 1; j >=0; j--) {

                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    flag = j;
                } else {
                    break;
                }
            }
            arr[flag] = temp;
        }
        return arr;
    }

}
