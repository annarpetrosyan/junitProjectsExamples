import org.junit.Test;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class OrderWithExample_IgnoreTest_timeoutSecond {

    @Test
    public void test1() {
        assertThat("albumen", both(containsString("a")).and(containsString("b")));
        System.out.println("1");
    }
}