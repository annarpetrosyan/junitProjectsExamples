package updateForLastThemes.listeners;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.Assert.assertFalse;

// callbacks about test execution.
//@ExtendWith(TimingExtension.class)
@ExtendWith(FailureLoggingExtension.class)
public class TempClass {
    @Test
    void test1() {
        assertFalse("failure - should be false", true);
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 1");
    }
}
