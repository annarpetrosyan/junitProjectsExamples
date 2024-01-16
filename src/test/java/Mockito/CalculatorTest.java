package Mockito;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    @Test
    public void testAddAndMultiply() {
        MathService mathServiceMock = mock(MathService.class);

        when(mathServiceMock.add(2, 3)).thenReturn(5);
        when(mathServiceMock.multiply(5, 4)).thenReturn(20);


        Calculator calculator = new Calculator(mathServiceMock);

        int result = calculator.addAndMultiply(2, 3, 4);

        assertEquals(20, result);

        verify(mathServiceMock).add(2, 3);
        verify(mathServiceMock).multiply(5, 4);
    }
}
