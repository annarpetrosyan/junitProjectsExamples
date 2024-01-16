package RuleTypes;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.core.Is.is;

public class ErrorCollectorRule {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void testWithMultipleAssertions() {
        int result1 = 2 + 2;
        int expected1 = 4;
        errorCollector.checkThat("Addition failed", result1, is(expected1));

        int result3 = 10; // Division by zero intentionally to demonstrate an error
        int expected3 = 5;
        errorCollector.checkThat("Division failed", result3, is(expected3));
    }
}
