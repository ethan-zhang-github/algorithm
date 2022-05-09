package priv.ethan.algorithm.sort.solutions;

import org.junit.Test;

public class HeapSortTest {

    @Test
    public void test() {
        Sort sort = new HeapSort();
        sort.sortRandom(10000, 1000000);
    }

}
