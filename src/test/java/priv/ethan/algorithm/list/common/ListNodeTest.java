package priv.ethan.algorithm.list.common;

import org.junit.Test;

public class ListNodeTest {

    @Test
    public void testGenerate() {
        ListNode randomList = ListNode.generateRandom(10, 10);
        System.out.println(randomList);
        ListNode fixedList = ListNode.generate(1, 2, 3, 4, 5, 6, 7);
        System.out.println(fixedList);
    }

}
