import org.junit.*;
import org.junit.Test;
//import org.junit.runner.OrderWith;
//import org.junit.runner.manipulation.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@TestMethodOrder(MethodOrderer.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderWithExample_IgnoreTest_timeout {

    @Rule
    public org.junit.rules.Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void test1() {
        System.out.println("1");
    }
    @Test(timeout = 10000)
    public void test4() {
        System.out.println("4");
    }
    @Ignore("Temporary disabled")
    @Test
    public void test2() {
        System.out.println("2");
    }
    @Test
    public void test3() {
        System.out.println("3");
    }

}

