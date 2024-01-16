package RuleTypes;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

public class TestNameRule {

    @Rule
    public TestName testName = new TestName();

    @Test
    public void testMethod1() {
        String currentTestName = testName.getMethodName();
        assertEquals("testMethod1", currentTestName);
    }

    @Test
    public void testMethod2() {
        String currentTestName = testName.getMethodName();
        assertEquals("testMethod2", currentTestName);

    }
}
