package priv.ethan.algorithm.sort.solutions;

import org.junit.Test;

public class InsertionSortTest {

    @Test
    public void test() {
        Sort sort = new InsertionSort();
        sort.sortRandom(100000, 100000);
    }

}
