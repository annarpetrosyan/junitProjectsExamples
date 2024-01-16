import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class AssumptionTest {

    @Test
    public void testOnWindows() {
        assumeTrue(System.getProperty("os.name").toLowerCase().contains("windows"));
        System.out.println("Test on Windows is running...");
    }

    @Test
    public void testOnLinux() {
//        System.out.println(System.getProperty("os.name").toLowerCase());
        assumeTrue(System.getProperty("os.name").toLowerCase().contains("mac os x"));
        System.out.println("Test on Linux is running...");
    }

}
