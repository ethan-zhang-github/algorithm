package priv.ethan.algorithm.list.solutions;

import org.junit.Test;
import priv.ethan.algorithm.list.common.ListNode;

public class RemoveNthFromEndTest {

    @Test
    public void test() {
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        ListNode list = ListNode.generateRandom(100, 10);
        System.out.println(list);
        System.out.println(removeNthFromEnd.removeNthFromEnd(list, 2));
    }

}
