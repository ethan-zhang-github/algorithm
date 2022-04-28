package priv.ethan.algorithm.sort.solutions;

import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void test() {
        Sort sort = new SelectionSort();
        sort.sortRandom(10000, 100000);
    }

}
