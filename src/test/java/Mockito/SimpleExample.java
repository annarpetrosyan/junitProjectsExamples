package Mockito;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SimpleExample {


    @Test
    public void simpleTestForMockObject(){
        List<String> mockObject = mock(List.class);

        when(mockObject.get(0)).thenReturn("This is for test");
//        verify(mockObject.get(0));
        assertEquals("This is for test", mockObject.get(0));

    }

}
