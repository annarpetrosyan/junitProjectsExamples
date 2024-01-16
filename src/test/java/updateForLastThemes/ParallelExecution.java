package updateForLastThemes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelExecution {

    @Test
    void testOne() {
        System.out.println("one");
    }

    @Test
    void testTwo() {
        System.out.println("two");
    }
}
