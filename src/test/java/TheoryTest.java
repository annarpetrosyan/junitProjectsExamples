import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import ParameterizedTest.MyClass;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {

    @DataPoints
    public static int[] positiveIntegers() {
        return new int[]{1, 5, 10};
    }

    @DataPoints
    public static int[] positiveIntegers1() {
        return new int[]{1, 5, 10};
    }

    @Theory
    public void testMultiplyByTwo(int input) {
        assumeTrue(input > 0);

        MyClass myClass = new MyClass();
        int result = myClass.multiplyByTwo(input);


        assertEquals("Multiplying by two", input * 2, result);
        System.out.println(result);
    }

    @Theory
    public void testMultiplyByTwo1(int input) {
        assumeTrue(input > 0);

        MyClass myClass = new MyClass();
        int result = myClass.multiplyByTwo(input);


        assertEquals("Multiplying by two", input * 2, result);
        System.out.println(result);
    }
}
