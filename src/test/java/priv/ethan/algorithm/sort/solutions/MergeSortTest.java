package priv.ethan.algorithm.sort.solutions;

import org.junit.Test;

public class MergeSortTest {

    @Test
    public void test() {
        Sort sort = new MergeSort();
        sort.sortRandom(10000, 1000);
    }

}
