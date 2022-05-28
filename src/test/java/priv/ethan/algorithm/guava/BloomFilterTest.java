package priv.ethan.algorithm.guava;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class BloomFilterTest {

    @SuppressWarnings("all")
    @Test
    public void test() {
        BloomFilter<CharSequence> bloomFilter = BloomFilter.create(Funnels.stringFunnel(StandardCharsets.UTF_8), 1 << 10);
        bloomFilter.put("ethan zhang");
        System.out.println(bloomFilter.test("ethan zhang"));
        System.out.println(bloomFilter.test("david yang"));
    }

}
