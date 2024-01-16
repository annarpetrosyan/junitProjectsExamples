package ParameterizedTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class MyParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 2 },
                { 5, 10 },
                { 10, 20 }
        });
    }

    private int input;
    private int expected;

    public MyParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testMultiplyByTwo() {
        MyClass myClass = new MyClass();
        int result = myClass.multiplyByTwo(input);
        assertEquals(expected, result);
    }

}