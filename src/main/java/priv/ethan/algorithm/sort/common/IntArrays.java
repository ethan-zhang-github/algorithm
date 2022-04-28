package priv.ethan.algorithm.sort.common;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrays {

    public static int[] generateRandom(int bound, int len) {
        return IntStream.generate(() -> (int) (Math.random() * bound)).limit(len).toArray();
    }

    public static int[] generateSorted(int bound, int len) {
        int[] arr = generateRandom(bound, len);
        Arrays.sort(arr);
        return arr;
    }

}
