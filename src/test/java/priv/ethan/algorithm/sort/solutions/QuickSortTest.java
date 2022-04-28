package priv.ethan.algorithm.sort.solutions;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void test() {
        Sort sort = new QuickSort();
        sort.sortRandom(10000, 100000);
    }

}
