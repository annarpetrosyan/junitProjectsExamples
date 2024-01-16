import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Invalid argument");

        // Your test code that is expected to throw IllegalArgumentException
        throw new IllegalArgumentException("Invalid argument");
    }
}