package priv.ethan.algorithm.num.solutions;

import org.junit.Assert;
import org.junit.Test;
import priv.ethan.algorithm.num.common.Nums;

public class FindKthLargestTest {

    @Test
    public void test() {
        FindKthLargest findKthLargest = new FindKthLargest();
        int kthLargest = findKthLargest.findKthLargest(Nums.generate(3, 2, 1, 5, 6, 4), 2);
        Assert.assertEquals(5, kthLargest);
    }

}
