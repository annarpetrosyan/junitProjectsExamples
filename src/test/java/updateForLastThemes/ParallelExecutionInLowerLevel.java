package updateForLastThemes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class ParallelExecutionInLowerLevel {

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    void testOne() {
        // Test code
    }

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    void testTwo() {
        // Test code
    }
}
