package priv.ethan.algorithm.sort.solutions;

import org.junit.Test;
import priv.ethan.algorithm.sort.common.IntArrays;

public class BubbleSortTest {

    @Test
    public void test() {
        Sort sort = new OptimizedBubbleSort();
        sort.sortRandom(10000, 100000);

        int[] sortedArr = IntArrays.generateSorted(10000, 100000);
        sort.sortPrint(sortedArr);
    }

}
