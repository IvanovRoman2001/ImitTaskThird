package imit.taskThird;

import static org.junit.Assert.*;

public class EndStringFilterTest {
    EndStringFilter filter = new EndStringFilter("силе");

    @org.junit.Test
    public void testGetPattern() {
        assertEquals("силе", filter.getPattern());
    }

    @org.junit.Test
    public void testApplyOK() {
        assertTrue(filter.apply("простота в силе"));
    }

    @org.junit.Test
    public void testApplyFalse() {
        assertFalse(filter.apply("Сила в простоте"));
        assertFalse(filter.apply(""));
    }
}
