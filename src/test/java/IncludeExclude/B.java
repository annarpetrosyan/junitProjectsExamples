package IncludeExclude;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class B {

    @Category(SlowTests.class)
    @Test
    public void c() {
        System.out.println("IncludeExclude.B Class: C method: ");
        assertEquals("IncludeExclude.B Class: failure - strings are equal", "text", "text");
    }
}