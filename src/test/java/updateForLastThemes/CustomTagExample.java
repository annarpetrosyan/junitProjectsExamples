package updateForLastThemes;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// JUnit doesn't have support for custom tags
// To have custom tag we should do in this way
@Tag("custom")
public class CustomTagExample {
    @Test
    @Tag("unit")
    public void a() {
        System.out.println("A");
    }

    @Test
    @Tag("unit")
    public void a1() {
        System.out.println("A_1");
    }

    @Test
    @Tag("integration")
    public void b() {
        System.out.println("B");
    }

    @Test
    @Tag("integration")
    public void b1() {
        System.out.println("B_1");
    }

}


