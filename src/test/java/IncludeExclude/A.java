package IncludeExclude;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;


public class A {

    @Category(FastTests.class)
    @Test
    public void a() {
        System.out.println("IncludeExclude.A Class: a method: ");
        assertEquals("IncludeExclude.A Class: a method: failure - strings are equal", "text", "text");
//        fail();
    }

    @Category(SlowTests.class)
    @Test
    public void b() {
        System.out.println("IncludeExclude.A Class: IncludeExclude.B method: ");
        assertEquals("IncludeExclude.A Class: b method: failure - strings are equal", "text", "text");

    }
}

