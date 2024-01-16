import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({
//        AssertTests.class,
//        AssertTests2.class,
//})


public class AssertTests {

    @Test
    public void testAssertStringEquals() {
        assertEquals("failure - strings are equal", "text", "text");
    }


    @Test
    public void testAssertFalse() {
        assertFalse("failure - should be false", true);
        assertFalse("failure - should be false", false);

    }


    @Test
    public void testAssertNotSame() {
        assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = 768;
        assertSame("should be same", aNumber, aNumber);
    }

}

