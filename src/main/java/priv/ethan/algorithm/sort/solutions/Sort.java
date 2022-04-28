package priv.ethan.algorithm.sort.solutions;

import priv.ethan.algorithm.sort.common.IntArrays;
import priv.ethan.algorithm.sort.exception.SortFailedException;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.stream.IntStream;

public interface Sort {

    int[] sort(int[] arr);

    default void sortPrint(int[] arr) {
        boolean isSorted = checkSorted(arr);
        System.out.printf("arr: %s, isSorted: %s%n", arr.length > 1000 ? "too long" : Arrays.toString(arr), isSorted);
        Instant start = Instant.now();
        System.out.println("starting sort, wait...");
        int[] sorted = sort(arr);
        Instant end = Instant.now();
        boolean checkRes = checkSorted(sorted);
        if (!checkRes) {
            throw new SortFailedException();
        }
        System.out.printf("sorted: %s\ncost: %s ms%n", sorted.length > 1000 ? "too long" : Arrays.toString(sorted), Duration.between(start, end).toMillis());
    }

    default void sortRandom(int bound, int len) {
        sortPrint(IntArrays.generateRandom(bound, len));
    }

    default boolean checkSorted(int[] arr) {
        return IntStream.range(1, arr.length - 1).allMatch(i -> arr[i] >= arr[i - 1]);
    }

    default void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
